package Methodoverriding;
class Loan{
    float getIR(){
        return 5.0f;
    }
}
class StudyLoan extends Loan{
    float getIR(){
        return 12.5f;
    }
}
class GoldLoan extends Loan{
    float getIR(){
        return 7.5f;
    }
}
class CraftLoan extends Loan{

}

public class Example2 {
    public static void main(String[] args) {
        Loan studyloan = new StudyLoan();
        System.out.println(" Study Loan : " + studyloan.getIR());
        Loan goldloan = new GoldLoan();
        System.out.println(" Gold Loan  : " + goldloan.getIR());
        Loan craftloan = new CraftLoan();
        System.out.println(" Craft Loan : " + craftloan.getIR());
    }
}
