package Array;


public class Floataverage {
    public static void main(String[] args) {
        float[] marks = {60.5f , 75.5f , 82.5f , 71.6f , 88.8f };
        float sum = 0;
        float average = 1;
        for(int i = 0 ; i < marks.length; i++){
            sum = sum + marks[i];
            average = sum / marks.length;
        }
        System.out.println("Average marks : " + average);

        }
    }




