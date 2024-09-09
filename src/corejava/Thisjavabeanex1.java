package corejava;
class Emp{
    private int empno;
    private String empname;
    private int empsalary;
    private String empaddress;

    public void setEmpno(int empno){
        this.empno=empno;
    }
    public void setEmpname(String empname){
        this.empname=empname;
    }

    public void setEmpsalary(int empsalary){
        this.empsalary=empsalary;
    }
    public void setEmpaddress(String empaddress){
        this.empaddress=empaddress;
    }
     public int getEmpno(){
        return empno;
    }
    public String getEmpname(){
        return empname;
    }
    public int getEmpsalary(){
        return empsalary;
    }
    public String getEmpaddres(){
        return empaddress;
    }


    }


public class Thisjavabeanex1 {
    public static void main(String[] args) {
        Emp detail = new Emp();
        detail.setEmpno(12345);
        detail.setEmpname("Prakash");
        detail.setEmpsalary(00000);
        detail.setEmpaddress("Pune");
        System.out.println(" Employee no. : " + detail.getEmpno());
        System.out.println(" Employee name : " + detail.getEmpname());
        System.out.println(" Employee salary : " + detail.getEmpsalary());
        System.out.println(" Employee address : " + detail.getEmpaddres());
    }
}
