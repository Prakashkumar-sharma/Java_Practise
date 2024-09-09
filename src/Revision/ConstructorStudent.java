package Revision;
class StudentDetail{
    String name;
    String branch;
    String collegeName;


    public  StudentDetail(String stdName , String stdBranch , String college){
        name = stdName;
        branch = stdBranch;
        collegeName = college;
    }

    public void getStudentDetail(){
        System.out.println("Student Name : " + name);
        System.out.println("Branch Name  : " + branch);
        System.out.println("College Name : " + collegeName);
    }
}

public class ConstructorStudent {
    public static void main(String[] args) {
        StudentDetail detail1 = new StudentDetail("Prakash" , "ECE" , "SMIC");
        detail1.getStudentDetail();

        System.out.println("-------------------");

        StudentDetail detail2 = new StudentDetail("Balram" , "ECE" , "SMCET");
        detail2.getStudentDetail();

        System.out.println("---------------------------");

        StudentDetail detail3 = new StudentDetail("Sohan Gope" , "EEE" , "SMEC");
        detail3.getStudentDetail();

        System.out.println("----------------------------");

        StudentDetail detail4 = new StudentDetail("Manzar" , "Mechanical" , "SMIC");
        detail4.getStudentDetail();

        System.out.println("------------------------------");

        StudentDetail detail5 = new StudentDetail("Kiran" , "Civil" , "SMIC");
        detail5.getStudentDetail();

        System.out.println("-------------------------------");

        StudentDetail detail6 = new StudentDetail("Abhijeet" , "ECE" , "SMIC");
        detail6.getStudentDetail();

    }
}
