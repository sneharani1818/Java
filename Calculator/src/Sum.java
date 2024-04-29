public class Sum {
    int num1, num2;
    Sum(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void getSum(){
        int s=num1+num2;
        System.out.println("Sum="+s);
    }
}
