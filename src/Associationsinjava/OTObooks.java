package Associationsinjava;

public class OTObooks {
    private String novel;
    private String fiction;
    private String drama;
    private String history;
    private String geography;
    private String polity;
    private String economics;

    public OTObooks(String novel, String fiction , String drama , String history , String geography , String polity , String economics){
        this.novel = novel;
        this.fiction = fiction;
        this.drama = drama;
        this.history = history;
        this.geography= geography;
        this.polity= polity;
        this.economics = economics;
    }


    public String getNovel(){
        return novel;
    }

    public String getFiction(){
        return fiction;
    }
    public String getDrama(){
        return drama;
    }
    public String getHistory(){
        return history;
    }
    public String getGeography(){
        return geography;
    }
    public String getPolity(){
        return polity;
    }
    public String getEconomics(){
        return economics;
    }
}


