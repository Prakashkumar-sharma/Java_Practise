package Inheritance;
class Firstclass{
    void prakash(){
        System.out.println(" Prakash ");
    }

}
class SecondClass extends Firstclass {
    void kumar(){
        System.out.println(" Kumar ");
    }
}
class Thirdclass extends SecondClass{
    void sharma(){
        System.out.println(" Sharma ");
    }
}



public class MultiLevelInheritanceexample1 {
    public static void main(String[] args) {
        Firstclass fc = new Firstclass();
        fc.prakash();

        SecondClass sc = new SecondClass();
        sc.prakash();
        sc.kumar();

        Thirdclass tc = new Thirdclass();
        tc.prakash();
        tc.kumar();
        tc.sharma();
    }
}
