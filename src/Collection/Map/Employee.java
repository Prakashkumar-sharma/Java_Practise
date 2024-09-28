package Collection.Map;

public class Employee {
    private String name;
    private Integer id;

    public Employee(String name , Integer id){
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object employee) {
        Employee employee1 = (Employee) employee;
        if(this.name.length()==employee1.name.length() && this.id.equals(employee1.id)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Param" , 12345);
        Employee emp2 = new Employee("Rohan" , 12345);
        Employee emp3 = new Employee("Prakash" , 12345);
        Employee emp4 = new Employee("Prakash" , 54321);
        Employee emp5 = new Employee("Prakash" , 54321);
        Employee emp6 = new Employee("Shubham" , 54321);





        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
        System.out.println(emp3.equals(emp4));
        System.out.println(emp4.equals(emp5));
        System.out.println(emp5.equals(emp6));

    }
}
