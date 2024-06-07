class ThrowsClass {
    static int divide(int a, int b) throws ArithmeticException{
        int result=0;
        result=a/b;
        return result;
    }
}
public class MainClass{
    public static void main(String[] args) {
        try{
            System.out.println(ThrowsClass.divide(10,0));
        }
        catch(ArithmeticException exp){
            System.out.println("Exception occured");
        }
    }
}
