package Revision;
class Employees {

    int eno = 111;
    String eName = "Durga ";
    float eSalary = 50000.0f;
    String eAddress = "Hyd";

    public void getEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("---------------------");
        System.out.println("Employee Number     : " + eno);
        System.out.println("Employee Name       : " + eName);
        System.out.println("Employee Salary     : " + eSalary);
        System.out.println("Employee Address    : " + eAddress);
    }
}
    class Students{

        String sId = "S-111";
        String sName = "Durga";
        String sEmailId = "durga@durgasoft.com";
        long sMobilNo = 9988776655L;

        public void getStudentDetails(){
            System.out.println("Student Details");
            System.out.println("---------------------");
            System.out.println("Student Id           : "+sId);
            System.out.println("Student Name         : "+sName);
            System.out.println("Student Email Id     : "+sEmailId);
            System.out.println("Student Mobile No    : "+sMobilNo);
        }
    }
    class Customers {

        String customerId = "C-111";
        String customerName = "Durga";
        String customerAddress = "Hyd";
        String customerWebsite = "www.durgasoft.com";
        String customerPhoneNo = "040-1234567";

        public void getCustomerDetails() {
            System.out.println("Customer Details");
            System.out.println("--------------------");
            System.out.println("Customer Id         : " + customerId);
            System.out.println("Customer Name       : " + customerName);
            System.out.println("Customer Address    : " + customerAddress);
            System.out.println("Customer Website    : " + customerWebsite);
            System.out.println("Customer Phone      : " + customerPhoneNo);
        }
    }



        public class MultipleMembers {
            public static void main(String[] args) {
                Employees emp = new Employees();
                emp.getEmployeeDetails();

                System.out.println("-------------------------");

                Students detail = new Students();
                detail.getStudentDetails();

                System.out.println("-------------------------");

                Customers details = new Customers();
                details.getCustomerDetails();
            }

            }

