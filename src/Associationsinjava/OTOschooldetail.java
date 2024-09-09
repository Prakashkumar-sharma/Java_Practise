package Associationsinjava;

public class OTOschooldetail {
    private String schoolname;
    private int standard;
    private String section;
    private String schooladdress;

    public OTOschooldetail(String schoolname , int standard , String section ,String schooladdress){
        this.schoolname=schoolname;
        this.standard = standard;
        this.section= section;
        this.schooladdress = schooladdress;
    }
    public String getSchoolname(){
        return schoolname;
    }

    public int getStandard(){
        return standard;
    }

    public String getSection() {
        return section;
    }

    public String getSchooladdress(){
        return schooladdress;
    }
}
