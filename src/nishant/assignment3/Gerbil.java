package nishant.assignment3;

public class Gerbil extends Rodent {

    @Override
    void attack() {
        System.out.println("Gerbil used Superfang");
    }

    @Override
    void getName() {
        System.out.println("Gerbil");
    }

    public Gerbil() { System.out.println("This is a Gerbil"); }
}
