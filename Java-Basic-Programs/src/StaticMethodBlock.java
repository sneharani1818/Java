public class StaticMethodBlock {
    static int count=0;
    StaticMethodBlock(){
        count++;
        System.out.println("Object created");
    }
    void funct1(){
        int i=45;
        System.out.println("i="+i);
        System.out.println("Count is accessible here, value="+count);
    }
    void funct2(){
//        System.out.println("i="+i);
        System.out.println("Local variable i is not accessible here!!");
    }
}
