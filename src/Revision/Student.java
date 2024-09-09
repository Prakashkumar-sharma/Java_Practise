package Revision;

public class Student {
    String name;
    String rollNo;
    String stream;
    float percentage;
    String college;

    public void studentDetail(){
        System.out.println("Name       : " + name);
        System.out.println("Roll no    : " + rollNo);
        System.out.println("Stream     : " + stream);
        System.out.println("Percentage : " + percentage);
        System.out.println("College    : " + college);
    }

    public static void main(String[] args) {
        Student detail1 = new Student();
        detail1.name = "Prakash";
        detail1.rollNo = "107WIA0430";
        detail1.stream = "ECE";
        detail1.percentage = 75.48f;
        detail1.college = "ST. MARY'S";
        detail1.studentDetail();

        System.out.println("--------------------------");

        Student detail2 = new Student();
        detail2.name = "Rahul";
        detail2.rollNo = "107WIA0404";
        detail2.stream = "CS";
        detail2.percentage = 67.20f;
        detail2.college = "SMIC";
        detail2.studentDetail();
    }

}
