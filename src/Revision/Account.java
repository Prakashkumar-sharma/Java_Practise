package Revision;

public class Account {
    private String transactionid;
    String customerName;
    String accountNumber;
    String branch;
    int depositedAmount;
    int withDrawlAmount;
    int transferredAmount;

    String transactionId(String transactionId){
       this.transactionid=transactionId;
       return transactionId;
    }

    public void deposit(){
        System.out.println("Name             : " + customerName);
        System.out.println("Account no.      : " + accountNumber );
        System.out.println("Branch           : " + branch);
        System.out.println("Deposited amount : " + depositedAmount);
        System.out.println("Transaction id   : " + transactionid);
    }

    public void transfer(){
        System.out.println("Name               : " + customerName);
        System.out.println("Account no.        : " + accountNumber );
        System.out.println("Branch             : " + branch);
        System.out.println("Transferred amount : " + depositedAmount);
        System.out.println("Transaction id     : " + transactionid);
    }

    public void withDrawl(){
        System.out.println("Name             : " + customerName);
        System.out.println("Account no.      : " + accountNumber );
        System.out.println("Branch           : " + branch);
        System.out.println("WithDrawl amount : " + depositedAmount);
        System.out.println("Transaction id   : " + transactionid);
    }
}
 class Detail{
     public static void main(String[] args) {
         Account detail1 = new Account();
         detail1.customerName = "Prakash";
         detail1.accountNumber = "HDFC123456789";
         detail1.branch = "Wakad,pune";
         detail1.depositedAmount = 100000;
         detail1.transferredAmount = 20000;
         detail1.withDrawlAmount = 30000;
         detail1.transactionId("DKGUKL78457388837383");
         detail1.deposit();

         System.out.println("----------------------------");

         detail1.transfer();

         System.out.println("-----------------------------");

         detail1.withDrawl();

     }

}
