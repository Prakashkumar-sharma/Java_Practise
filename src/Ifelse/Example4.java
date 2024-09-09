package Ifelse;

public class Example4 {
    public static void main(String[] args) {
        int percentage = 99;
        if(percentage< 30){
            System.out.println("Fail");
        }
         else if (percentage < 40) {
            System.out.println("Pass");
        }
         else if (percentage < 50) {
            System.out.println("Third class");
        }
         else if (percentage < 60) {
            System.out.println("Second class");
        }
         else if (percentage < 70) {
            System.out.println("First class");
        }
         else if (percentage > 70 && percentage < 100) {
            System.out.println("Distinction");
        }
         else {
            System.out.println("Invalid Percentage");
        }
    }
}
