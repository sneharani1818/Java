package inheritance;

class Animal {
    String name;
    static int objectsCount;
    static{
        objectsCount=0;
        System.out.println("In static block of Animal");
    }
    Animal()
    {
        this("An animal");
        objectsCount++;
    }
    Animal(String name)
    {
        this.name=name;
        objectsCount++;
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
        System.out.println(Animal.objectsCount);
        c1.eat();
        Cat c2=new Cat("Tom2");
        System.out.println(Animal.objectsCount);
    }
}