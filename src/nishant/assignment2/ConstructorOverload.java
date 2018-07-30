package nishant.assignment2;

public class ConstructorOverload {
/*
* Demonstrates Constructor Overloading by having two constructors for the same class differing only in the arguments it takes
* Further demonstrates how a constructor can be called from within another constructor of the same class if needed
 */
    private String string;

    public ConstructorOverload() {
        this("Hello World!");               //Calls the constructor of the same class with a String argument
    }

    public ConstructorOverload(String str) {
        string = str;
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload();
        System.out.println(obj1.string);        //Prints the string despite it not being directly initialized in the constructor which was explicitly called
    }
}
