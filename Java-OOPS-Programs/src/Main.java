public class Main {
    public static void main(String[] args) {
//        System.out.println(args[0]);
        System.out.println("Creating object of Shape class");
        Shape s1=new Shape();
        s1.draw();
        s1.erase();
        System.out.println("Creating object of Circle class");
        Circle c1=new Circle();
        c1.draw();
        c1.erase();
        System.out.println("Creating object of Triangle class");
        Triangle t1=new Triangle();
        t1.draw();
        t1.erase();
        System.out.println("Creating object of Square class");
        Square sq1=new Square();
        sq1.draw();
        sq1.erase();
    }
}