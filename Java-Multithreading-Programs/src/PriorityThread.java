class MyThread2 implements Runnable{
    String s=null;
    Thread t;
    public MyThread2(String s, int priority) {
        super();
        this.s = s;
        t = new Thread(this);
        t.setPriority(priority);
        t.start();
    }
    @Override
    public void run(){
        System.out.println(s+" started with priority="+t.getPriority());
    }
}
public class PriorityThread {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("Thread 1", Thread.MAX_PRIORITY);
        MyThread2 t2 = new MyThread2("Thread 2", Thread.MIN_PRIORITY);
    }
}
