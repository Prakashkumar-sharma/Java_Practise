package Revision;
class Sports{
    private String name;
    private String sportsName;

    public void setName(String name){
        this.name = name;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public String getName(){
        return  name;
    }
    public String getSportsName(){
        return sportsName;
    }
}

public class ThisSports {
    public static void main(String[] args) {
      Sports player1 = new Sports();
      player1.setName("Sachin Tendulkar");
      player1.setSportsName("Cricket");

        System.out.println("Player Name : " + player1.getName());
        System.out.println("Sport  Name : " + player1.getSportsName());

        System.out.println("------------------------------");

        Sports player2 = new Sports();
        player2.setName("Neeraj Chopra");
        player2.setSportsName("Javelin");
        System.out.println("Player Name : " + player2.getName());
        System.out.println("Sport  Name : " + player2.getSportsName());

    }
}
