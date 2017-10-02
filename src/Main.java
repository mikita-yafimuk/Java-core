public class Main {
    public static int getFactorial(int num) throws Exception{

        if(num<1) throw new Exception("Число не может быть меньше 1");
        int result=1;
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        try {
            System.out.println(getFactorial(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nikita");
    }
}
