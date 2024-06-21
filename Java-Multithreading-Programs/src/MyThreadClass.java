public class MyThreadClass implements Runnable{
    String s=null;

    public MyThreadClass(String s) {
        super();
        this.s = s;
        new Thread(this).start();
    }
    @Override
    public void run(){
        System.out.println(s+" started");
    }
}
