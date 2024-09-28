package Collection.Map;

public class Name {
    private String name;
    private Integer rollNumber;

    public Name(String name , Integer rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object name) {
        Name student1 = (Name) name;
       if(this.name.startsWith(String.valueOf(student1.getName().charAt(0))) && this.rollNumber<50 && student1.rollNumber<50){
           return true;
       }
       else {
           return false;
       }
    }

    public static void main(String[] args) {
        Name student1 = new Name("Prakash" , 45);
        Name student2 = new Name("Prakash" , 40);
        Name student3 = new Name("Vikram" , 5);
        Name student4 = new Name("Prakash" , 65);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student1.equals(student4));


    }
}
