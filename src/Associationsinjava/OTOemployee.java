package Associationsinjava;

public class OTOemployee {
    private String empname;
    private int empid;
    private int empsalary;
    private String empaddress;
    private OTOaccount account;
    public OTOemployee( String empname , int empid , int empsalary , String empaddress , OTOaccount account){
        this.empname = empname;
        this.empid = empid;
        this.empsalary = empsalary;
        this.empaddress = empaddress;
        this.account = account;

    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("-------------------------");
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Salary: " + empsalary);
        System.out.println("Employee Address: " + empaddress);
        System.out.println("Account Details");
        System.out.println("-------------------------");
        System.out.println("Account Number: " + account.getAccountno());
        System.out.println("Account Holder Name: " + account.getAccountholdername());
        System.out.println("Account Type: " + account.getAccounttype());
        System.out.println("Account Balance: " + account.getAccountbalance());


    }


    public static void main(String[] args) {
        OTOaccount account = new OTOaccount("PNB1234" , "Mahendra" , "Saving" , 500000);
        OTOemployee emp = new OTOemployee("Mahendra" , 12345 , 30000 , "Delhi" , account );
        emp.getEmployeeDetails();

    }

}
