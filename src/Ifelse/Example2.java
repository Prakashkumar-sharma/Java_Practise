package Ifelse;

public class Example2 {
    public static void main(String[] args) {
        int num1 = 51;
        int num2 = 50;
        System.out.println(num1);
        System.out.println(num2);

        if(num1>num2){
            System.out.println(num1 + " is greater ");
        }
        else if (num2>num1)
        {
            System.out.println(num2 + " is greater ");
        }
        else {
            System.out.println("Both are equal ");
        }
    }
}
