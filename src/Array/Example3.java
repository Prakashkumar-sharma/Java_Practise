package Array;

public class Example3 {
    public static void main(String[] args) {
        int[] ints = new int[5];
        ints[0] = 10;
        ints[1] = 20;
        ints[2] = 30;
        ints[3] = 40;
        ints[4] = 50;


        System.out.println(ints);
        System.out.println(ints.length);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[ints.length-1]);

        System.out.println();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println();
        for(int element: ints){
            System.out.println(element);
        }

    }
}
