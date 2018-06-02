package core.annotations;

@Service(name = "Simple Service")
public class SimpleService {
    @Init
    public void initService() {
        System.out.println("initService() from SimpleService invoked");
    }
}
