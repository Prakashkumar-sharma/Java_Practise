package Break;

public class Example5 {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println(i + " Java");
            while(i==2){
              System.out.println(i + " Existing the loop");
              break;
          }
        }
    }
}
