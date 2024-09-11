package Revision;
class FamousFood{
    String foodName;
    String state;

    public void setDetail(String foodName , String state){
        this.foodName = foodName;
        this.state = state;
    }
    public String getFoodName(){
      return foodName;
    }
    public String getState(){
        return state;
    }
}

public class Foods {
    public static void main(String[] args) {
       FamousFood item1 = new FamousFood();
       item1.setDetail("Butter Chicken" , "Punjab");
        System.out.println("Food Name : " + item1.getFoodName() +" , " +  "State : " + item1.getState());

        FamousFood item2 = new FamousFood();
        item2.setDetail("Dal Baati" , "Rajasthan");
        System.out.println("Food Name : " + item2.getFoodName() +" , " +  "State : " + item2.getState());
    }
}
