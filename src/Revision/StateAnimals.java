package Revision;
class Animal{
    String animalName;
    String state;

    public Animal(String animalName , String state){
        this.animalName = animalName;
        this.state = state;
    }
    public String getAnimalName(){
        System.out.println("Animal Name : " + animalName);
        return animalName;
    }
    public String getState(){
        System.out.println("State name : " + state);
        return state;
    }
}

public class StateAnimals {
    public static void main(String[] args) {
        Animal detail1 = new Animal("Elephant" , "Jharkhand");
        detail1.getAnimalName();
        detail1.getState();

        System.out.println("----------------------------");

        Animal detail2 = new Animal("Tiger" , "West Bengal");
        detail2.getAnimalName();
        detail2.getState();

        System.out.println("----------------------------");

        Animal detail3 = new Animal("Indian Bison" , "Bihar");
        detail3.getAnimalName();
        detail3.getState();
    }
}
