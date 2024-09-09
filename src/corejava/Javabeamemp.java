package corejava;
class Employeess{

    private int empid;
    private String empname;
    private String empaddress;
    private int empsalary;

    public void setempId( int EmpId){
        empid=EmpId;
    }
    public int getempId(){
        return empid;
    }

    public void setempName(String Empname){
        empname=Empname;
    }
    public String getempName(){
        return empname;
    }

    public void setempAddress(String Empaddress){
        empaddress=Empaddress;
    }

    public String getempAdress(){
        return empaddress;
    }

    public void setempSalary(int Empsalary){
        empsalary = Empsalary;
    }

    public int getempSalary(){
        return empsalary;
    }

}

public class Javabeamemp {
    public static void main(String[] args) {
        Employeess emp = new Employeess();
        emp.setempId(98765);
        emp.setempName("Rohit");
        emp.setempAddress("Indore");
        emp.setempSalary(50000);

        System.out.println(" Employee detail ");
        System.out.println("---------------------------");
        System.out.println(" Employee Id : " + emp.getempId());
        System.out.println(" Employee Name : " + emp.getempName());
        System.out.println(" Employee Address : " + emp.getempAdress());
        System.out.println(" Employee Salary : Rs " + emp.getempSalary());
    }
}
