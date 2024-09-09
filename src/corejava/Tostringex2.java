package corejava;
class Transaction{
    String accno = "ABC123";
    String customername = "Rohan Daruwala";
    String transactionId  = "zyxwvu9876543";
    String transactiontype = "Withdrawal";
    int withdrawalamount = 10000;
    int remainingbalance = 490000;
    String transactionstatus = " Successful";

    public String toString(){
        System.out.println("Transaction detail..........");
        System.out.println("Account no. :  " + accno);
        System.out.println("Customer name : " + customername);
        System.out.println("Transcation Id : " + transactionId);
        System.out.println("Transcation type : " + transactiontype);
        System.out.println("Withdrawal amount : " + withdrawalamount);
        System.out.println("Remaining balance : " + remainingbalance);
        System.out.println("Transaction status : " + transactionstatus);
        return " Thankyou Visit Again ";
    }
}

public class Tostringex2 {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        System.out.println(transaction);
    }
}
