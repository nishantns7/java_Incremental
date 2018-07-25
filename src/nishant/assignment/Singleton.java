package nishant.assignment;

public class Singleton {

    private String string;
    private static Singleton obj1;

    /*
    * Takes a String as argument to initialize the object of this class
    * Returns an initialized instance of this class
    * @param s String which the new object must be initialized with
     */
    public static Singleton initializer(String s) {
        if(obj1 == null)        //checks if an instance has been created already
            obj1 = new Singleton();
        obj1.string = s;         //initializes the member variable with the string passed to this function
        return obj1;     //returns initialized object object of this class
    }
    /*
    * Prints out the value contained in string of the calling instance
     */
    public void printer() {
        System.out.println(string);
    }
}
