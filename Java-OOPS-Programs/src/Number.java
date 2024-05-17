public class Number {
    private double num;
    Number(){
        num=0;
    }
    Number(double num){
        this.num=num;
    }
    boolean isZero(){
        return num == 0;
    }
    boolean isPositive(){
        return num>0;
    }
    boolean isNegative(){
        return num<0;
    }
    boolean isOdd(){
        return num%2==1;
    }
    boolean isEven(){
        return num%2==0;
    }
    boolean isPrime(){
        int count=0;
        int i=2;
        while(i*i<num){
            if(num%i==0)
                return false;
            i++;
        }
        return true;
    }
    int digits(){
        int count=0;
        for(int i=(int)num;i>0;i/=10)
            count++;
        return count;
    }
    boolean isArmstrong(){
        int d=digits();
        int sum=0;
        int copy=(int)num;
        while(copy>0){
            sum+=Math.pow(copy%10,d);
            copy/=10;
        }
        return copy==(int)num;
    }

}
