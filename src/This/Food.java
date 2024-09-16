package This;

class FoodItem{
    String food;
    String state;

    void foodName(){
        System.out.println("Food Name : " + food);
        this.stateName();
    }

    void stateName(){
        System.out.println("State Name : " + state);
    }
}

public class Food {
    public static void main(String[] args) {
        FoodItem food1 = new FoodItem();
        food1.food = "Litti Chokha";
        food1.state = "Bihar";
        food1.foodName();

        System.out.println("---------------------------");

        FoodItem food2 = new FoodItem();
        food2.food = "Pav Bhaji";
        food2.state = "Maharashtra";
        food2.foodName();
    }
}

