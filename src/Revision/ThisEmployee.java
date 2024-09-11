package Revision;
class Emp{
   private String name;
   private int eid;
    private String department;
     String address;

     public void setName(String name){
         this.name = name;
     }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        System.out.println("Name : " + name);
         return name;
    }

    public int getEid() {
        System.out.println("Employee Id : " + eid);
        return eid;
    }
    public String getDepartment(){
        System.out.println("Department : " + department);
        return department;
    }

    public String getAddress(){
        System.out.println("Address : " + address);
        return address;
    }
}

public class ThisEmployee {
    public static void main(String[] args) {
        Emp detail1 = new Emp();
        detail1.setName("Prakash");
        detail1.setEid(12345);
        detail1.setDepartment("IT");
        detail1.setAddress("Pune");
        detail1.getName();
        detail1.getEid();
        detail1.getDepartment();
        detail1.getAddress();

        System.out.println("-------------------");

        Emp detail2 = new Emp();
        detail2.setName("Abhijeet");
        detail2.setEid(98765);
        detail2.setDepartment("Management");
        detail2.setAddress("Mumbai");
        detail2.getName();
        detail2.getEid();
        detail2.getDepartment();
        detail2.getAddress();

        System.out.println("----------------------");

        Emp detail3 = new Emp();
        detail3.setName("Rahul");
        detail3.setEid(45678);
        detail3.setDepartment("Digital Market");
        detail3.setAddress("Delhi");
        detail3.getName();
        detail3.getEid();
        detail3.getDepartment();
        detail3.getAddress();


    }
}
