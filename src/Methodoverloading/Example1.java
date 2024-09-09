package Methodoverloading;
class Math{
    public void add(int i , int j){
        System.out.println(" Sum : " + (i+j));
    }
    public void add(float f1 , float f2){
        System.out.println(" Sum : " + (f1+f2));
    }
    public void add(String str1 , String str2 ){
        System.out.println(" Sum : " + (str1+str2));
    }
}
public class Example1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.add(10,20);
        math.add(22.22f,33.33f);
        math.add("abc" , "def");
    }
}
