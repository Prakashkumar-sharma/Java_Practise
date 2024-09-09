
class Addition{
    int x;
    int y;
    int z;
    Addition(){

    }
    Addition(int a){
        x=a;
    }
    Addition(int a,int b){
        x=a;
        y=b;
    }
    Addition(int a, int b, int c){
        x=a;
        y=b;
        z=c;
    }
    public void add(){
        System.out.println(" Addition : " + (x+y+z));
    }
}
public class Constructoroverloadingex1{
    public static void main(String[] args) {
        Addition sum1 = new Addition();
        sum1.add();

        Addition sum2 = new Addition(10);
        sum2.add();

        Addition sum3 = new Addition(10,20);{
            sum3.add();

        Addition sum4 = new Addition(10,20,30);
        sum4.add();
        }

    }
}
