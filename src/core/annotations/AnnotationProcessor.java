package core.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationProcessor {
    static Map<String, Object> servicesMap = new HashMap<>();

    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

        loadService("core.annotations.SimpleService");
        loadService("core.annotations.LazyService");
        loadService("java.lang.String");

        invokeService("SimpleService");
        invokeService("LazyService");

    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());
        }
        Method[] methods = service.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Init.class)) {
                System.out.println("Init present");
            } else {
                //System.out.println("Init doesn't presented");
            }
        }
    }

    static void loadService(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            if (clazz.isAnnotationPresent(Service.class)) {
                Object serviceObj = clazz.newInstance();
                servicesMap.put(clazz.getSimpleName(), serviceObj);
            }
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void invokeService(String service) {
        Object object = servicesMap.get(service);
        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Init.class)) {
                try {
                    method.invoke(object);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    Init ann = method.getAnnotation(Init.class);
                    if (ann.suppressException()) {
                        System.err.println(e.getMessage());
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
        }
    }
}
