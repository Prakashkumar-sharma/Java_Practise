package Revision;

public class Employee {
    String empName;
    String empID;
    String empDepartment;
    String empAddress;

    public void empDetails(){
        System.out.println("Employee Name       :" + empName);
        System.out.println("Employee ID         :" + empID);
        System.out.println("Employee Department :" + empDepartment);
        System.out.println("Employee Address    :" + empAddress);
    }
}
class Main{
    public static void main(String[] args) {
        Employee detail1 = new Employee();
        detail1.empName = "Abhijeet";
        detail1.empID   = "ABHI1234";
        detail1.empDepartment = "Marketing";
        detail1.empAddress = "Khargar";
        detail1.empDetails();

        System.out.println("----------------------------");

        Employee detail2 = new Employee();
        detail2.empName= "Mohit";
        detail2.empID = "MOH9876";
        detail2.empDepartment = "Sales";
        detail2.empAddress = "Bandra";
        detail2.empDetails();

    }
}
