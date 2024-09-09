package Ifelse;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        int Physics;
        int Chemistry;
        int Maths;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics : ");
        Physics = sc.nextByte();
        System.out.println("Enter your marks in Chemistry : ");
        Chemistry = sc.nextByte();
        System.out.println("Enter your marks in Maths : ");
        Maths = sc.nextByte();
        float percentage = (Physics+Chemistry+Maths)/3.0f;
        if(Physics>=33 && Chemistry>=33 && Maths>=33 && percentage >=40f){
            System.out.println("You are pass");
        }
        else {
            System.out.println("You are fail");
        }
    }
}
