package corejava;
class MyBokaroFriends{
    String name;
    String sector;
    static String city = "Bokaro";
     void friendsDetails(){
         System.out.println("Name : " + name);
         System.out.println("Sector : " + sector);
         System.out.println("City : " + city);
     }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        MyBokaroFriends friend1 = new MyBokaroFriends();
        friend1.name = "Vikram";
        friend1.sector = "2/B";
        friend1.friendsDetails();

        System.out.println("------------------");

        MyBokaroFriends friend2 = new MyBokaroFriends();
        friend2.name = "Mrityunjay" ;
        friend2.sector = "2/C";
        friend2.friendsDetails();

        System.out.println("------------------");


        MyBokaroFriends friend3 = new MyBokaroFriends();
        friend3.name = "Shashikant";
        friend3.sector = "12/A";
        friend3.friendsDetails();



    }


}

