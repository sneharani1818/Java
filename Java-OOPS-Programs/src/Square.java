public class Square extends Shape{
        void draw(){
            super.draw();
            System.out.println("In draw() of Square");
        }
        void erase(){
            super.erase();
            System.out.println("In erase() of Square");
        }
    }
