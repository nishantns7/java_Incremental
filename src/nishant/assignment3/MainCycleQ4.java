package nishant.assignment3;

public class MainCycleQ4 {
/*
* Demonstrates the factory design pattern
* Initializes the object with the right class type based on the information passed with it
 */
    public static void main(String[] args) {

        CycleFactory factory = new CycleFactory();
        CycleInterface cycle1 = factory.getCycle(1);
        CycleInterface cycle2 = factory.getCycle(2);
        CycleInterface cycle3 = factory.getCycle(3);
        cycle1.wheels();
        cycle2.wheels();
        cycle3.wheels();
    }
}
