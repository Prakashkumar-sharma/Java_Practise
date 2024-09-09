package Ifelse;

public class Example10 {
    public static void main(String[] args) {
        String name = "Vikram";
        String job  = "Software engineer";
        String address = "Pune";
        long salary = 3800000;
        float tax;
        if(salary < 500000){
            tax = 0;
        } else if (salary>1000000 && salary < 2000000) {
            tax = (float) (salary* 10/100);

        }
        else if (salary>2000000 && salary < 3000000) {
            tax = (float) (salary* 15/100);

        } else if (salary>3000000 && salary < 4000000) {
            tax = (float) (salary* 20/100);
        }
        else{
            tax = salary * 30/100;
        }
        System.out.println("Customer Details");
        System.out.println("------------------------");
        System.out.println("Customer Name            : "+ name);
        System.out.println("Customer Profession      : "+ job);
        System.out.println("Customer Address         : "+ address);
        System.out.println("Customer Annual Income   : "+ salary);
        System.out.println("Tax Payment              : "+ tax);
    }

}
