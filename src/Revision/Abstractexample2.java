package Revision;
abstract class Area{
    void areaName(){
        System.out.println("Name of Area : Wakad ");
    }
    abstract void municipality();

    abstract void district();
}
class State extends Area{
    @Override
    void municipality() {
        System.out.println("Municipality : Pimpri Chichwad");
    }

    @Override
    void district() {
        System.out.println("District     : Pune");
    }
    void State(){
        System.out.println("State        : Maharashtra");
    }
}


public class Abstractexample2 {
    public static void main(String[] args) {
        Area area = new State();
        area.areaName();
        area.municipality();
        area.district();

        System.out.println("-------------------");

        State state = new State();
        state.areaName();
        state.municipality();
        state.district();
        state.State();
    }
}
