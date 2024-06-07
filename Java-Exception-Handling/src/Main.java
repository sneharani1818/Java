public class Main {
    static int divide(int a, int b){
        int result=0;
        try{
            result=a/b;
        }
        catch(ArithmeticException exp) {
            System.out.println("Exception occured");
        }
        finally {
            return result;
        }
    }
    public static void main(String[] args) {
       //try catch finally
        System.out.println(divide(10,0));
    }
}