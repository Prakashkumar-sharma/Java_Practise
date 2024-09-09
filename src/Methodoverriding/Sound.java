package Methodoverriding;
class Animal{
    void sound(){
        System.out.println("Sound produced");
    }
}
class Bird extends Animal{
    void sound(){
        System.out.println("bird : chirps");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat  : Meows");
    }
}
public class Sound {
    public static void main(String[] args) {
        Animal animal = new Bird();
        animal.sound();

        Animal animal1 = new Cat();
        animal1.sound();
    }
}
