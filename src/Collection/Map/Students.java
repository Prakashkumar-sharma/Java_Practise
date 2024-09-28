package Collection.Map;

public class Students {
    private String firstName;
    private String lastName;

    public Students(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public boolean equals(Object student) {
        Students students1 = (Students) student;
        if(this.firstName.equals( students1.firstName) && this.lastName.equals(students1.lastName)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Students first = new Students("Prakash" , "Sharma");
        Students second = new Students("Vikram" , "Singh");
        Students third = new Students("Prakash" , "Sharma");
        Students fourth = new Students("Vikram"  , "Singh");
        System.out.println(first.equals(third));
        System.out.println(second.equals(fourth));
        System.out.println(first.equals(second));

    }

}
