package Foreachloop;

public class Example3 {
    public static void main(String[] args) {
        int[] marks = {80, 90, 70, 60, 85};
        int mark = 95;
        boolean b = false;
        for (int i : marks) {
            if (mark == i) {
                b = true;
                break;
            }
        }
            if (b) {
                System.out.println(mark + " is available ");
            } else {
                System.out.println("Not available ");
            }
        }
    }
