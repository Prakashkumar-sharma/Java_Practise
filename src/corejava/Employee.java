package corejava;

class Empdetail{
    int empno = 170592;
    String ename = "Prakash";
    float esal = 50000.0f;
    String eaddress = "Pune";

    public void getEmpdetails(){
        System.out.println("Employee detail : ");
        System.out.println("---------------");
        System.out.println("Employee number : " + empno);
        System.out.println("Employee name : " + ename);
        System.out.println("Employee salary : " + esal);
        System.out.println("Employee address : " + eaddress);
    }
}

public class Employee {
    public static void main(String[] args) {
        Empdetail edetail = new Empdetail();
        edetail.getEmpdetails();
    }
}
