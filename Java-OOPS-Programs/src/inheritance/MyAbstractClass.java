package inheritance;
abstract class AbstractClass{
    void display(){
        System.out.println("In display of AbstractClass");
    }
    abstract void absMethod();
}
class ChildClass extends AbstractClass{
    void absMethod()
    {
        System.out.println("This is overridden abstract method in ChildClass");
    }
}
public class MyAbstractClass {
    public static void main(String[] args) {
//        AbstractClass a1=new AbstractClass();
        
    }
}
