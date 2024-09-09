package Inheritance;

public class Manager extends Employee{
    public Manager(String managerid , String managername, float managersal, String manageraddress){
        eid=managerid;
        ename=managername;
        esal=managersal;
        eaddress=manageraddress;
    }
    public void getManageerdetails(){
        System.out.println(" Manager details ");
        System.out.println(" ---------------------------- ");
        getEmployeedetails();
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Manager98765" , " Sunil " , 90000.00f , " Mumbai");
        manager.getManageerdetails();
    }
}
