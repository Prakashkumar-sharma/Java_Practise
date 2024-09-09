package Inheritance;

public class Accountant extends Employee {
    public Accountant(String accname, String accid, float accsal, String accaddress) {
        eid = accid;
        ename = accname;
        esal = accsal;
        eaddress = accaddress;
    }

    public void getAccountantdetails() {
        System.out.println(" Accountant details ");
        System.out.println(" ------------------------- ");
        getEmployeedetails();
    }

    public static void main(String[] args) {
        Accountant accountant = new Accountant("Accountant45623", " Akshay", 80000.00f, " Banglore ");
        accountant.getAccountantdetails();
    }
}
