package Foreachloop;

public class Average {
    public static void main(String[] args) {
        int[] marks = { 80 ,90 ,85, 70 ,65};
        int sum = 0;
        int average = 1;
        for(int physics : marks){
            sum = sum + physics;
            average = physics / 5;
        }
        System.out.println("Average : " + average);
    }
}
