import java.util.*;
public class Main {
//    static void sumCmdArgs(int []arr){
//
//    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a,b,c;
//        System.out.println("Enter three numbers");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        if(a>b){
//            if(a>c)
//                System.out.println(a+" is greatest");
//            else
//                System.out.println(c+" is greatest");
//        }
//        else
//        {
//            if(b>c)
//                System.out.println(b+" is greatest");
//            else
//                System.out.println(c+" is greatest");
//        }
//        int len=args.length;
//        int sum=0;
//        for (int i = 0; i < len; i++) {
//            sum+=Integer.parseInt(args[i]);
//        }
//        System.out.println(sum);

//        Room r1=new Room();
//        r1.setData(1234,"General",20.25,true);
//        r1.displayData();

//        SimpleObject s1=new SimpleObject();
//        SimpleObject s2=new SimpleObject("Dolly");

        StaticMethodBlock obj1=new StaticMethodBlock();
        obj1.funct1();
        obj1.funct2();
        System.out.println(StaticMethodBlock.count);
        StaticMethodBlock obj2=new StaticMethodBlock();
        obj2.funct1();
        obj2.funct2();
        System.out.println(StaticMethodBlock.count);
        
    }
}