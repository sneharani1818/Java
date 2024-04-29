public class Triangle extends Shape{
        void draw(){
            super.draw();
            System.out.println("In draw() of Triangle");
        }
        void erase(){
            super.erase();
            System.out.println("In erase() of Triangle");
        }
    }
