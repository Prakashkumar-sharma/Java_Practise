package Associationsinjava;

public class OTOhospital {
    private  String name;
    private String address;

    private String type;
    private OTOdepartments departments;

    public OTOhospital(String name,String address,String type, OTOdepartments departments ){
        this.name = name;
        this.address = address;
        this.type=type;
        this.departments = departments;

    }
    public  void getHospitaldetails(){
        System.out.println(" Detail of hospital ");
        System.out.println(" ---------------------------- ");
        System.out.println(" Name of Hospital : " + name);
        System.out.println(" Address : " + address );
        System.out.println( " Type : " + type);

        System.out.println(" Departments ");
        System.out.println(" ----------------------- ");
        System.out.println(" - " + departments.getSurgery());
        System.out.println(" - " + departments.getNeurology());
        System.out.println(" - " + departments.getCardiology());
        System.out.println(" - " + departments.getENT());
        System.out.println(" - " + departments.getDermatology());
        System.out.println(" - " + departments.getGastrology());
        System.out.println(" - " + departments.getEmergency());
        System.out.println(" - " + departments.getMedicine());

    }

    public static void main(String[] args) {
        OTOdepartments departments = new OTOdepartments(" Surgery " , " Dermatology " , " ENT " , " Gastrology " , " Cardiology " , " Neurology " , " Emergency " , " Medicine ");
        OTOhospital hospital = new OTOhospital(" Medanta" , " Gurugram " , " Super Specility " , departments );
        hospital.getHospitaldetails();
    }
}
