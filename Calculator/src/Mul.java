public class Mul {
    int num1, num2;
    Mul(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void getProd(){
        int prod=num1*num2;
        System.out.println("Product="+prod);
    }
}
