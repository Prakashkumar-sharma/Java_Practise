package corejava;
class Employees {
    int empno = 1006;
    String empname = "Nagoor";
    Float empsalary = 60000.0f;
    String empaddress = "Hyderabad";

    public void getEmployeedetail(){
        System.out.println("Employee detail : ");
        System.out.println("------------");
        System.out.println("Employee no. : " + empno);
        System.out.println("Employee name : " + empname);
        System.out.println(":Employee salary : " + empsalary);
        System.out.println("Employee address : " + empaddress);

    }

}
class Student{
    int studentidno =  12345;
    String studentname = "Prakash";
    String coursename = " Core Java";
    String address = "Pune";

    public void getStudentdetail(){
        System.out.println("Student detail : ");
        System.out.println("-------------");
        System.out.println("Student idno. " + studentidno);
        System.out.println("Student name : " + studentname);
        System.out.println("Course name : " + coursename);
        System.out.println("Student address : " + address);

    }
}

class Customer{
    String customername = "Suresh Babu";
    long customermobno = 9999999999L;
    String customeraddress = "Guntur";

    public void getCustomerdetail(){
        System.out.println("Customer detail : ");
        System.out.println("---------");
        System.out.println("Customer name : " + customername);
        System.out.println("Customer mob. no. : " + customermobno);
        System.out.println("Customer address : " + customeraddress);
    }
}


public class Multipledetail {
    public static void main(String[] args) {
        Employees empdetails = new Employees();
        empdetails.getEmployeedetail();

        System.out.println();

        Student studdetail = new Student();
        studdetail.getStudentdetail();

        System.out.println();

        Customer customerdetail = new Customer();
        customerdetail.getCustomerdetail();
    }

}
