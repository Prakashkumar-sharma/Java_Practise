package Array;

public class Example4 {
    public static void main(String[] args) {
        int[][] ints = {{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(ints);
        System.out.println(ints.length);
        System.out.println(ints[0]);
        System.out.println(ints[1].length);
        System.out.println(ints[1][0]);
        System.out.println(ints[2][0]);
        System.out.println(ints[2][1] + ints[1][1]);
        System.out.println(ints[ints.length - 1][ints[0].length - 2]);
        System.out.println(ints[0][2]);
    }
}
