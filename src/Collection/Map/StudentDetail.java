package Collection.Map;

public class StudentDetail {
    private String firstName;
    private String lastName;

    private Integer rollNumber;

    public StudentDetail(String firstName , String lastName , Integer rollNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object student) {
        StudentDetail student1 = (StudentDetail) student;
        //if((this.firstName.equals(student1.firstName) && this.rollNumber.equals(student1.rollNumber) || this.lastName.equals(student1.lastName) && this.rollNumber.equals(student1.rollNumber)|| this.firstName.equals(student1.firstName) && this.lastName.equals(student1.lastName) && this.rollNumber.equals(student1.rollNumber))){
        if((this.firstName.equals(student1.getFirstName()) || this.lastName.equals(student1.getLastName())) && this.rollNumber == student1.getRollNumber()){
        return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        StudentDetail first = new StudentDetail("Prakash" , "Sharma" , 1);
        StudentDetail abc = new StudentDetail("Vikram" , "Sharma" , 2);
        StudentDetail second = new StudentDetail("Vikram" , "Sharma" , 1);
        StudentDetail third = new StudentDetail("Rohit" , "Sharma" , 1);
        StudentDetail fourth = new StudentDetail("Vikram" , "Hadda" , 1);
        StudentDetail fifth = new StudentDetail("Mritunjay" , "Yadav" , 11);
        StudentDetail sixth = new StudentDetail("Vikram" , "Singh" , 7);
        StudentDetail seventh = new StudentDetail("Prakash" , "Sharma" , 1);
        StudentDetail eighth = new StudentDetail("Mritunjay" , "Yadav" , 11);


        System.out.println(first.equals(third));
        System.out.println(second.equals(fourth));
        System.out.println(first.equals(fifth));
        System.out.println(first.equals(seventh));
        System.out.println(fifth.equals(eighth));




    }
}
