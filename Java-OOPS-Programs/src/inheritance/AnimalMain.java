package inheritance;

class Animal {
    String name;
    static{
        System.out.println("In static block of Animal");
    }
    Animal()
    {
        this("An animal");
    }
    Animal(String name)
    {
        this.name=name;
    }
    void eat()
    {
        System.out.println(this.name+" is eating");
    }
}

class Cat extends Animal
{
    static{
        System.out.println("In static block of Cat");
    }
    {
        System.out.println("In instance block of CAT"+super.name);
    }
    Cat()
    {
        super();
    }
    Cat(String name)
    {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(super.name+" is eating now");
    }
}

public class AnimalMain
{
    public static void main(String[] args) {
        Cat c1=new Cat("Tom");
        c1.eat();
        Cat c2=new Cat("Tom2");
    }
}