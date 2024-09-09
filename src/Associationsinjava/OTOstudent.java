package Associationsinjava;

public class OTOstudent {
    private String name;
    private String fathername;
    private String mothername;

    private OTOschooldetail detail;

    public OTOstudent(String name , String fathername, String mothername, OTOschooldetail detail){
        this.name=name;
        this.fathername= fathername;
        this.mothername=mothername;
        this.detail=detail;

    }

      public void getOTOstudent(){
          System.out.println(" Student detail ");
          System.out.println("------------------------");
          System.out.println(" Student name : " +  name);
          System.out.println(" Father's name : " + fathername);
          System.out.println((" Mother's name : " + mothername));
          System.out.println(" School details ");
          System.out.println(" --------------------------- ");
          System.out.println(" Name of school : " + detail.getSchoolname());
          System.out.println(" Standard : " + detail.getStandard());
          System.out.println(" Section : " + detail.getSection());
          System.out.println( " School Address : " + detail.getSchooladdress());
      }


          public static void main(String[] args) {
              OTOschooldetail sdetail = new OTOschooldetail(" BIV 2/D " , 10 , " B " , " Sector - 2/D , Bokaro");
              OTOstudent student = new OTOstudent("  Rohit " , " Ram bahadur " , " Asha Devi " , sdetail );
              student.getOTOstudent();


      }

}

