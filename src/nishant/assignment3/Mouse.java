package nishant.assignment3;

public class Mouse extends Rodent {

    @Override
    void attack() {
        System.out.println("Mouse used Bite");
    }

    @Override
    void getName() {
        System.out.println("Mouse");
    }

    public Mouse() {
        System.out.println("This is a Mouse");
    }
}
