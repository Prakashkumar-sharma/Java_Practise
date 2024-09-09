package Dowhileloop;

public class Multiplicationtable {
    public static void main(String[] args) {
       int x = 9;
       int  y = 1;
       do {
           int table = x * y;
           System.out.println(x + " * " +  y  + " = " + table);
           y++;
       }while (y<=10);
    }
}
