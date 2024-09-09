package corejava;
class Accounts{
    String accno;
    String custname;
    String acctype;
    long accbalance;

    public Accounts(String accountno, String customername, String accounttype, long accountbalance){
        accno=accountno;
        custname=customername;
        acctype=accounttype;
        accbalance=accountbalance;
    }

    public void getAccountsdetails(){
        System.out.println("Account details");
        System.out.println("----------------------------------");
        System.out.println(" Account no.  : " + accno);
        System.out.println(" Customer name : " + custname);
        System.out.println(" Account type : " + acctype);
        System.out.println(" Account Balance : " + accbalance);
    }

}

public class Constructorex1 {
    public static void main(String[] args) {
        Accounts account1 = new Accounts("ABC123" , "Prakash", "Saving", 5000);
        account1.getAccountsdetails();
        System.out.println();

        Accounts account2 = new Accounts("DEF456",  "Vikram", "Current", 1500000);
        account2.getAccountsdetails();
        System.out.println();

        Accounts account3 = new Accounts("GHI789", "Mritunjay", "Current", 200000);
        account3.getAccountsdetails();
    }
}
