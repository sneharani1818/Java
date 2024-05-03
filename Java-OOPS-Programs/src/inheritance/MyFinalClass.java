package inheritance;

final class FinalClass
{
    void displayMsg()
    {
        System.out.println("Display of FinalClass");
    }
}
//Error in below commented lines since a final class cannot ne inherited
//class ChildClass extends FinalClass{
//
//}
public class MyFinalClass {
    public static void main(String[] args) {
        FinalClass f1=new FinalClass();
        f1.displayMsg();
//        ChildClass c2=new ChildClass();//error
    }
}
