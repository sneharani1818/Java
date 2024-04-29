public class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;
    void setData(int roomno, String roomtype, double roomarea, boolean ACmachine){
        this.roomno=roomno;
        this.roomtype=roomtype;
        this.roomarea=roomarea;
        this.ACmachine=ACmachine;

    }
    void displayData(){
        System.out.println("Room no:"+roomno);
        System.out.println("Room type:"+roomtype);
        System.out.println("Room area:"+roomarea);
        System.out.println("AC Machine availability:"+ACmachine);
    }
}
