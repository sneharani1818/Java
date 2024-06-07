class AgeCheckException extends Exception{
    String error;
    AgeCheckException(String error){
        this.error=error;
    }
    public String toString(){
        return "AgeException occurred";
    }
}
class Vote{
    int age;
    Vote(int age){
        this.age=age;
    }
    void doVote() throws AgeCheckException{
        if(age<18)
            throw new AgeCheckException("AgeCheck Exception occurred");
        else
            System.out.println("You can vote");
    }
}
public class UserDefException {
    public static void main(String[] args) {
       Vote v=new Vote(12);
       try{
           v.doVote();
       }
       catch (AgeCheckException exp){
           System.out.println(exp);
       }
    }
}
