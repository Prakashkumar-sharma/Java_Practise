package Array;

public class Example5 {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        ints[0][0] = 1;
        ints[0][1] = 2;
        ints[0][2] = 3;
        ints[1][0] = 2;
        ints[1][1] = 3;
        ints[1][2] = 4;
        ints[2][0] = 3;
        ints[2][1] = 4;
        ints[2][2] = 5;


        System.out.println(ints);//[[I@abc123
        System.out.println(ints.length);//3
        System.out.println(ints[0]);//[I@a111
        System.out.println(ints[1].length);//3
        System.out.println(ints[1][0]);// 2
        System.out.println(ints[2][0]);//3
        System.out.println(ints[2][1] + ints[1][1]);//4+3 = 7
        System.out.println(ints[ints.length - 1][ints[0].length - 2]);//ints[2][1]=4

    }
}
