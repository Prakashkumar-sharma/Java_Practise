package This;
class Children{
    private String name;
    private int standard;
    private int rollNo;

     public void setName(String name){
         this.name = name;
     }
     public String getName(){
         return name;
     }

    public void setStandard(int standard){
        this.standard = standard;
    }
    public int getStandard(){
        return standard;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }



}

public class Student {
    public static void main(String[] args) {
        Children detail1 = new Children();
        detail1.setName("Krishna");
        detail1.setStandard(10);
        detail1.setRollNo(12345);
        System.out.println("Name : " + detail1.getName());
        System.out.println("Class : " + detail1.getStandard());
        System.out.println("Roll no. : " + detail1.getRollNo());

        System.out.println("--------------------------------");

        Children detail2 = new Children();
        detail2.setName("Balram");
        detail2.setStandard(11);
        detail2.setRollNo(54321);
        System.out.println("Name : " + detail2.getName());
        System.out.println("Class : " + detail2.getStandard());
        System.out.println("Roll no. : " + detail2.getRollNo());

    }
}
