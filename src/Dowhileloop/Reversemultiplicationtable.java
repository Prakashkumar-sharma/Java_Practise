package Dowhileloop;

public class Reversemultiplicationtable {
    public static void main(String[] args) {
        int x = 9;
        int  y = 10;
        do {
            int table = x * y;
            System.out.println(x + " * " +  y  + " = " + table);
            y--;
        }while (y>=1);
    }
    }

