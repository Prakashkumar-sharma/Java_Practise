package Collection.Map;

public class School {
    private Integer yearOfAdmission;
    private Integer yearOfPassing;

    private String schoolName;
    private Integer standard;
    private Character section;

    public School(Integer yearOfAdmission , Integer yearOfPassing , String schoolName , Integer standard , Character section){
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfPassing = yearOfPassing;
        this.schoolName = schoolName;
        this.standard = standard;
        this.section = section;
    }

    public void setYearOfAdmission(Integer yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public Integer getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfPassing(Integer yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public Integer getYearOfPassing() {
        return yearOfPassing;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setSection(Character section) {
        this.section = section;
    }

    public Character getSection() {
        return section;
    }

    @Override
    public boolean equals(Object school) {
        School school1 = (School) school;
        if ((this.yearOfAdmission.equals(school1.getYearOfAdmission()) && this.yearOfPassing.equals(school1.getYearOfPassing()) && this.schoolName.equals(school1.getSchoolName())) || (this.standard.equals(school1.getStandard()) && this.section.equals(school1.getSection()))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        School school1 = new School(1999 , 2008 , "BIV 2/D" , 10 , 'B');
        School school2 = new School(1999 , 2008 , "BIV 2/D" , 10 , 'A');
        School school3 = new School(1999 , 2008 , "Holy Cross" , 10 , 'A');
        School school4 = new School(1999 , 2008 , "Holy Cross" , 10 , 'B');
        School school5 = new School(1999 , 2008 , "MGM" , 10 , 'A');
        School school6 = new School(2000 , 2010 , "DPS" , 11 , 'A');
        School school7 = new School(1999 , 2008 , "BIV 2/D" , 11 , 'A');
        School school8 = new School(1999 , 2008 , "Chinmaya" , 10 , 'B');


        System.out.println(school1.equals(school2));
        System.out.println(school1.equals(school5));
        System.out.println(school6.equals(school7));
        System.out.println(school1.equals(school5));
        System.out.println(school1.equals(school8));

    }
    }

