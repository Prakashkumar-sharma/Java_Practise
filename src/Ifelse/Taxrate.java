package Ifelse;

import java.util.Scanner;

public class Taxrate {
    public static void main(String[] args) {
      //  float taxrate = 0;
        int income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the income : " + "Rs ");
        income = sc.nextInt();
        float taxpayable = 0;
        if(income < 250000){
            System.out.println("You are out of tax slab");
        } else if (income>250000 && income<500000) {
            taxpayable = (income*5)/100;
            System.out.println("You have to pay : " + "Rs " + taxpayable);
        }
        else if (income>500000 && income<1000000) {
            taxpayable = (income*10)/100;
            System.out.println("You have to pay : " + "Rs " + taxpayable);

        }else  {
            taxpayable = (income*30)/100;
            System.out.println("You have to pay : " + "Rs " + taxpayable);

        }

        }
    }

