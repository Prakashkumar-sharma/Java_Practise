package Break;

public class Example6 {
    public static void main(String[] args) {
            int i = 0;
            do {
                System.out.println(i + " Java ");
                if (i == 2) {
                    System.out.println(i + " Ending the loop ");
                    break;
                }i++;
            }while (i<5);
                System.out.println("Completed");
            }

        }

