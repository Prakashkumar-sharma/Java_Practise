package Ifelse;

public class Example6 {
    public static void main(String[] args) {
        float a = -2;
        float b = 8;
        float c = 3;
        float y;
        double z;
        y = (b * b) - (4 * a * c);
        z = y/(2 * a);
        if(z > 0){
            System.out.println("Having multiple roots");
    } else if (z == 0) {
            System.out.println("Having single root");
        }
        else{
            System.out.println("Having no root");
        }

    }
}
