package abstraction;

abstract class Sum{
    int num1, num2;
    void getSum(int num1, int num2){
        System.out.println("Sum="+(num1+num2));
    }
    abstract void displaySum();
}
class SumSub extends Sum{
    SumSub(int num1, int num2){
        super.num1=num1;
        super.num2=num2;
    }

    @Override
    void displaySum() {
        System.out.println("Sum="+(super.num1+super.num2));
    }
}
public class Calc {
    public static void main(String[] args) {
        SumSub s1=new SumSub(23, 45);
        s1.displaySum();
        s1.getSum(10,20);
        Sum s2=new Sum(){
            @Override
            void displaySum(){
                System.out.println("Sum by anonymous sub class="+(super.num1+super.num2));
            }
        };
        s2.num1=20;
        s2.num2=40;
        s2.displaySum();
        s2.getSum(45,67);
    }
}
