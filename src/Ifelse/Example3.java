package Ifelse;

public class Example3 {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 60;
        int num3 = 70;

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greater ");
        }
        else if (num2 >= num3 && num2 >= num1) {
            System.out.println(num2 + " is greater ");
        }
        else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is greater ");
        }
        else {
            System.out.println(" All are equal ");
        }


    }
}