package Javabean;
class Pg{
    private String pgName;
    private int roomNo;
    private String mess;
    private String location;

    public void setPgName(String hostelName){
        pgName = hostelName;
    }
    public String getPgName(){
        return pgName;
    }
    public void setRoomNo(int room){
        roomNo = room;
    }
    public int getRoomNo(){
        return roomNo;
    }
    public void setMess(String dining){
        mess = dining;
    }
    public String getMess(){
        return mess;
    }
    public void setLocation(String address){
        location = address;
    }
    public String getLocation(){
        return location;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Pg hostel = new Pg();
        hostel.setPgName("CoLive");
        hostel.setRoomNo(1018);
        hostel.setMess("Dining area on P3 floor");
        hostel.setLocation("Wakad , Pune");

        System.out.println("PG Detail");
        System.out.println("-------------------");
        System.out.println("PG name  : " + hostel.getPgName());
        System.out.println("Room No. : " + hostel.getRoomNo());
        System.out.println("Dining   : " + hostel.getMess());
        System.out.println("Address  : " + hostel.getLocation());
    }
}
