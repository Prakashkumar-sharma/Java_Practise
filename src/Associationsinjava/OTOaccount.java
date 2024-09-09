package Associationsinjava;

public class OTOaccount {

    private String accountno;
    private String accountholdername;
    private String accounttype;
    private double accountbalance;

    public OTOaccount(String accountno ,String accountholdername , String accounttype , double accountbalance )
    {
        this.accountno = accountno;
        this.accountholdername = accountholdername;
        this.accounttype = accounttype;
        this.accountbalance = accountbalance;

    }

    public String getAccountno(){
        return accountno;
    }

    public String getAccountholdername(){
        return accountholdername;
    }
    public String getAccounttype(){
        return accounttype;
    }
    public double getAccountbalance(){
        return accountbalance;
    }
}
