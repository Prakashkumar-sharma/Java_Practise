package corejava;
class Name{
    String name = "Prakash";
    String middle = "Kumar";
    String title = "Sharma";

    Name(String name, String middle, String title){
        System.out.println(" Name inside home : " + name + middle +  title);
        System.out.println(" Name in class : " + this.name + " " + this.middle + " " +  this.title);
    }
}

public class Thisrefvariableex2 {
    public static void main(String[] args) {
        Name call = new Name("Prakash" , " kumar" , " Sharma");
    }
}
