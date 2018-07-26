package nishant.assignment3;

public class CycleFactory {

    public CycleInterface getCycle(int wheels) {
        switch(wheels) {
            case 1: return new UnicycleQ4();
            case 2: return new BicycleQ4();
            case 3: return new TricycleQ4();
            default: return null;
        }
    }
}
