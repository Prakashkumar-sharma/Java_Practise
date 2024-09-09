package corejava;
final class Abc{
    private int var;
    Abc(int var){
        this.var=var;
    }
    public Abc increamentVar(){
        Abc abc = new Abc(++var);
        return abc;
    }
    public Abc decrementVar(){
        Abc abc = new Abc(--var);
        return abc;
    }
    public int getVar(){
        return var;
    }


}

public class Userdefinedimmutableclass {
    public static void main(String[] args) {
        Abc abc = new Abc(10);
        System.out.println(abc.increamentVar().getVar());
        System.out.println(abc.increamentVar().getVar());
        System.out.println(abc.decrementVar().getVar());
        System.out.println(abc.decrementVar().getVar());
        System.out.println();

        Abc abc1 = abc.increamentVar();
        System.out.println(abc1 + " : " + abc1.getVar());
        Abc abc2 = abc1.increamentVar();
        System.out.println(abc2 + " : " + abc2.getVar());
    }
}
