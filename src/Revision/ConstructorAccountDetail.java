package Revision;
class AccountDetail{
    String customerName;
    int accountNumber;
    String transactionId;
    int availableBalance;


    public void setAccountDetail(){
        customerName = "Rohit";
        accountNumber = 12345;
        transactionId = "ABCDE567431234";
        availableBalance = 10000;
    }

    public void getAccountDetail(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("TransactionId : " + transactionId);
        System.out.println("Available Balance: Rs " + availableBalance);
    }
}

public class ConstructorAccountDetail {
    public static void main(String[] args) {
        AccountDetail detail = new AccountDetail();
        detail.setAccountDetail();
        detail.getAccountDetail();

    }
}
