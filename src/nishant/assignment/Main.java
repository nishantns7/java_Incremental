package nishant.assignment;

public class Main {
/*
* Creates an instance of class Data and prints the member variables to demonstrate default initialization
* Printing the local variables fail because they weren't initialized by any default constructors
* Creates a singleton instance and initializes it with a string which is passed to it
 */
    public static void main(String[] args) {
        Data obj = new Data();      //new instance of the Data class
        obj.printer();      //printing the member variables initialized by the default constructor
//      obj.localPrinter();     //fails because the local variables (which override the global ones) are not initialized
        Singleton obj2 = Singleton.initializer("Hello World!");     //creates a singleton instance and initializes it with the string
        obj2.printer();
    }
}
