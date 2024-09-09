package Associationsinjava;

public class OTOdepartments {
    private String Surgery;
    private String Dermatology;
    private String ENT;
    private String Gastrology;
    private String Cardiology;
    private String Neurology;
    private String Emergency;
    private String Medicine;

    public OTOdepartments(String surgery,String dermatology,String ent,String gastrology,String cardiology , String neurology, String emergency, String medicine){
        this.Surgery=surgery;
        this.Dermatology=dermatology;
        this.ENT=ent;
        this.Gastrology=gastrology;
        this.Cardiology=cardiology;
        this.Neurology=neurology;
        this.Emergency=emergency;
        this.Medicine=medicine;
    }
      public String getSurgery(){
        return Surgery;
      }
    public String getDermatology(){
        return Dermatology;
    }
    public String getENT(){
        return ENT;
    }
    public String getGastrology(){
        return Gastrology;
    }
    public String getCardiology(){
        return Cardiology;
    }
    public String getNeurology(){
        return Neurology;
    }
    public String getEmergency(){
        return Emergency;
    }
    public String getMedicine(){
        return Medicine;
    }


}
