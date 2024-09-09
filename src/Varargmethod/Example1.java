package Varargmethod;
class Addition{
    public void add(int x , int y){
        System.out.println("Sum : " + (x+y));
    }
}

public class Example1 {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.add(10,20);//to access the method same no. of parameter must be provided as declared
    }
}
