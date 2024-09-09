package Inheritance;

public class Engineer extends Employee{
    public Engineer(String engid , String engname , float engsalary , String engaddress){
        eid=engid;
        ename=engname;
        esal=engsalary;
        eaddress=engaddress;
    }
    public void getEngineerdetails(){
        System.out.println(" Engineer detail ");
        System.out.println(" ------------------------ ");
        getEmployeedetails();
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer("Engineer12345" , " Rakesh " , 100000.00f, "Hyderabad");
        engineer.getEngineerdetails();
    }
}
