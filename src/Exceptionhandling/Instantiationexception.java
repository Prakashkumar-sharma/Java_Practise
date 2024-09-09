package Exceptionhandling;
class Employee{
    Employee(int eno){

    }
}

public class Instantiationexception {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("Employee");
        Employee emp = (Employee) cls.newInstance();
    }


}


