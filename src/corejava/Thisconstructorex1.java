package corejava;
class XYZ{

    XYZ(){
        this(10);
        System.out.println("Constructor class with no parameters");
    }
    XYZ(int i){
        this(22.22f);
        System.out.println("Constructor with parameter integer");

    }
    XYZ(float f){
        this(33.33);
        System.out.println("Consteuctor with float parameter");

    }
    XYZ(double d){

        System.out.println("Constructor with double parameter");
    }
}

public class Thisconstructorex1 {
    public static void main(String[] args) {

        XYZ detail = new XYZ();
    }
}
