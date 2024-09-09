package Methodoverloading;
class Calculation{
    int calculate(int x , int y, int z){
        System.out.println(x+y+z);
        return x+y+z;

    }

    int calculate(int a , int b){
        System.out.println(a-b);
        return a-b;
    }
    int calculate(int k,int l, int m ,int n){
        System.out.println(k*l*m*n);
        return k*l*m*n;
    }
}
public class Example3 {
    public static void main(String[] args) {
        Calculation calculate = new Calculation();
        calculate.calculate(5,10,15);
        calculate.calculate(50,25);
        calculate.calculate(2,5,4,10);
    }
}
