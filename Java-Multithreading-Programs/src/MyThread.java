public class MyThread extends Thread{
    String s=null;
    MyThread (String s1)
    {
        s=s1;
        start();
    }

    @Override
    public void run() {
        super.run();
        System.out.println(s);
    }
}
