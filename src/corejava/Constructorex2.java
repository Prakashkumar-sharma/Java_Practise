package corejava;
class Empsdetail{
    String empname;
    String empid;
    String empadderess;
    long empsal;

    public Empsdetail(String name, String id , String address, long salary){
        empname=name;
        empid=id;
        empadderess=address;
        empsal= salary;
    }

    public void getEmpsdetail(){
        System.out.println(" Employee detail ");
        System.out.println("-------------------------");
        System.out.println(" Employee name : " + empname);
        System.out.println(" Employee Id : " + empid);
        System.out.println(" Employee address : " + empadderess);
        System.out.println(" Employee salary : " + empsal);
    }

}

public class Constructorex2 {
    public static void main(String[] args) {
        Empsdetail detail1 = new Empsdetail("Vikram" , "VIK123" , "Bokaro" , 1000000);
        detail1.getEmpsdetail();
        System.out.println();

        Empsdetail detail2 = new Empsdetail("Akshay" , "AKS456", "Kota" , 500000);
        detail2.getEmpsdetail();
        System.out.println();

        Empsdetail detail3 = new Empsdetail("Shubham ", "SHUB789", "Aurangabad" , 300000);
        detail3.getEmpsdetail();
    }

}
