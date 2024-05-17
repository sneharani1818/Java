package multipleinheritance;

interface Rectangle{
    void getArea(Rectangle r);
}
interface Circle{
    void getArea(Circle c);
}
interface Area extends Rectangle,Circle{
    void getArea(Area a);
}

class Shape implements Rectangle,Circle{
    int l, b;
    int r;
    Shape(int l, int b){
        this.l=l;
        this.b=b;
    }
    Shape(int r){
        this.r=r;
    }
    @Override
    public void getArea(Circle c){
        System.out.println("Circle area="+(Math.PI*r*r));
    }
    @Override
    public void getArea(Rectangle r){
        System.out.println(("Rectangle Area="+(l*b)));
    }
}

public class AreaMain {
    public static void main(String[] args) {
        Shape s1=new Shape(28);
        ((Circle)s1).getArea(s1);
        Shape s2=new Shape(3,5);
        ((Rectangle)s2).getArea(s2);
    }
}