package Exceptionhandling;

public class Illegalargumentacception {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(7);
        System.out.println(thread.getPriority());
        thread.setPriority(11);
        System.out.println(thread.getPriority());
    }
}
