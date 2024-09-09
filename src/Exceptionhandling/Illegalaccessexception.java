package Exceptionhandling;
class Employees{
    private Employees(){

    }
}

public class Illegalaccessexception {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("Employee");
        Employee emp = (Employee) cls.newInstance();

    }
}
