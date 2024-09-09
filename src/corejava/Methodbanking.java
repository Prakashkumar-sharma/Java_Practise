package corejava;
class Account{
    public String createAccount(int accno , String accholdername , String acctype , long balance) {

        System.out.println(" Account detail ");
        System.out.println(" --------------");
        System.out.println(" Account number : " + accno);
        System.out.println(" Account holder name : " + accholdername);
        System.out.println(" Account type : " + acctype);
        System.out.println(" Account balance : " + balance);
        return "Account created successfully";
    }
     public String searchAccount(int accno){
        return "Account existed with account no. : " + accno;
     }

     public String accountUpdate(int accno , String accholdername , String acctype , long balance){
         System.out.println(" Account detail ");
         System.out.println(" --------------");
         System.out.println(" Account number : " + accno);
         System.out.println(" Account holder name : " + accholdername);
         System.out.println(" Account type : " + acctype);
         System.out.println(" Account balance : " + balance);
         return " Account updated successfully ";

     }

     public String deleteAccount(int accno){
        return " Account deleted with account no. : " + accno;
     }
}
public class Methodbanking {
    public static void main(String[] args) {
        Account account = new Account();
      //  account.createAccount(12345 , "Prakash" , "Saving account" , 5000 );
        String status = account.createAccount(12345 , " Prakash" , " Saving account " , 5000);
        System.out.println(" Status : " + status);

        System.out.println(" --------------------------------------");

        String result = account.searchAccount(12345);
        System.out.println(" result : " + result);

        System.out.println(" ----------------------------------------");

        String update = account.accountUpdate(12345 , " Prakash " , " Saving " , 10000);
        System.out.println(update);

        System.out.println(" ---------------------------------------------");


        String delete = account.deleteAccount(12345);
        System.out.println(delete);

    }

}
