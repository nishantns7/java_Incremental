package nishant.assignment3;

public class Hamster extends Rodent {

    @Override
    void attack() {
        System.out.println("Hamster used Hyperfang");
    }

    @Override
    void getName() {
        System.out.println("Hamster");
    }

    public Hamster() {
        System.out.println("This is a Hamster");
    }
}
