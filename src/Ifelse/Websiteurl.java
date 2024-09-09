package Ifelse;

import java.util.Scanner;

public class Websiteurl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Entre the url : ");

        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is organisational website");
        }
         else if (website.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is Indian website");
        }
    }
}
