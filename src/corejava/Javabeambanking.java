package corejava;
class Accountdetail{
    private long accno;
    private String customername;
    private int accbalance;
    private String acctype;
    private String branchname;

    public void setAccno(long accNo){
        accno=accNo;
    }
    public long getAccno(){
        return accno;
    }
    public void setCustomername(String customerName){
        customername=customerName;
    }
    public String getCustomername(){
        return customername;
    }
     public void setAccbalance(int accBalance){
        accbalance = accBalance;
     }

    public int getAccbalance() {
        return accbalance;
    }

    public void setAcctype(String accType){
        acctype=accType;
    }
    public  String getAcctype(){
        return acctype;
    }
    public void setBranchname(String branchName){
        branchname=branchName;
    }

    public String getBranchname(){
        return branchname;
    }
}

public class Javabeambanking {
    public static void main(String[] args) {
        Accountdetail account = new Accountdetail();
        account.setAccno(123456789L);
        account.setCustomername("Piyush");
        account.setAcctype("Saving");
        account.setAccbalance(75000);
        account.setBranchname("Pimple Saudagar ,Pune");

        System.out.println(" Customer detail : ");
        System.out.println("--------------------");
        System.out.println(" Account no. : " + account.getAccno());
        System.out.println(" Customer name : " + account.getCustomername());
        System.out.println((" Account type : " + account.getAcctype()));
        System.out.println( " Account balance : Rs " + account.getAccbalance());
        System.out.println( " Branch name : " + account.getBranchname());
    }
}
