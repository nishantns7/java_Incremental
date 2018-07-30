package nishant.assignment2;

public class ConstructorString {
/*
* Demonstrates how the constructor is called only during the actual creation of an object
* Simply declaring an object type does not call the constructor
* Constructors are used for initialization rather than declaration
 */
    public ConstructorString() {
        System.out.println("Hello World!");
    }

    public static void main( String[] args) {
        ConstructorString obj[] = new ConstructorString[5];     //Creates an array of objects; does not create the objects yet
        for(ConstructorString i : obj)
            i = new ConstructorString();                        //The objects are created; the constructor is called
    }
}
