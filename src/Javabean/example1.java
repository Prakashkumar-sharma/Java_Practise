package Javabean;
class Employee{
    private String eName;
    private String eid;
    private String eSalary;
    private String eAddress;

    public void setEName( String empName){
      eName = empName;
    }
    public String getEName(){
        return eName;
    }

    public void setEId(String empId){
        eid = empId;
    }

    public String getEId(){
        return eid;
    }
    public void setESalary(String empSalary){
        eSalary = empSalary;

    }
    public String getESalary(){
        return eSalary;
    }

    public void setEAddress(String empAddress){
        eAddress = empAddress;
    }
    public String getEAddress(){
        return eAddress;
    }

}
public class example1 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEName("Vikram");
        emp.setEId("GL123");
        emp.setESalary("Rs 200000");
        emp.setEAddress("Pune");


        System.out.println("Employee Details");
        System.out.println("---------------------");
        System.out.println("Employee Name     :    "+ emp.getEName());
        System.out.println("Employee Id       :    "+emp.getEId());
        System.out.println("Employee Salary   :    "+emp.getESalary());
        System.out.println("Employee Address  :    "+emp.getEAddress());


    }
}
