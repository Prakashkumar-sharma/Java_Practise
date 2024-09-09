package Inheritance;

public class Employee {
    String eid;
    String ename;
    float esal;
    String eaddress;

    public void getEmployeedetails(){
        System.out.println(" Employee details ");
        System.out.println(" ------------------------------ ");
        System.out.println(" Name   : " + ename );
        System.out.println(" Emp ID : " + eid);
        System.out.println(" Salary : " + esal);
        System.out.println(" Address: " + eaddress);
    }

}


