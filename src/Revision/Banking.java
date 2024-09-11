package Revision;
class BankDetail {
    String customerName;
    int accountNumber;
    String transactionId;
    int availableBalance;

    public BankDetail(String name , int accno , String transid , int balance){
        customerName = name;
        accountNumber = accno;
        transactionId = transid;
        availableBalance = balance;
    }
    public void getBankDetail(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("TransactionId : " + transactionId);
        System.out.println("Available Balance: Rs " + availableBalance);

    }
}
public class Banking {
    public static void main(String[] args) {
        BankDetail customer1 = new BankDetail("Prakash" , 98765432 , "xyz847383930" , 5000);
        customer1.getBankDetail();

        System.out.println("----------------------------------------");

        BankDetail customer2 = new BankDetail("Rohit" , 567483930 , "abc374848599"  , 10000);
        customer2.getBankDetail();

        System.out.println("-----------------------------------------");

        BankDetail customer3 = new BankDetail("Deepak" , 67483948 , "tra9484859595" , 50000);
        customer3.getBankDetail();
    }
}
