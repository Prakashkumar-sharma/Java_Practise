package Methodoverloading;
class Employee{
    public void generatesalary(int basic, float hk , int ta , float pf){
        float salary = basic + (basic*hk/100)  + hk - (basic*pf/100);
        System.out.println(" Salary : " + salary);
    }
    public void generatesalary(int basic, float hk , int ta , float pf,int bonus){
        float salary = basic + (basic*hk/100)  + hk - (basic*pf/100) + bonus;
        System.out.println(" Salary : " + salary);
    }
}
public class Example2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.generatesalary(50000, 25.0f, 5000, 12.5f);
        employee.generatesalary(50000,25.0f,5000,12.5f,5000);
    }
}
