package nishant.assignment2;

public class ConstructorOverload {

    private String string;

    public ConstructorOverload() {
        this("Hello World!");
    }

    public ConstructorOverload(String str) {
        string = str;
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload();
        System.out.println(obj1.string);
    }
}
