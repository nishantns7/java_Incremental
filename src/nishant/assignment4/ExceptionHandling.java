package nishant.assignment4;

public class ExceptionHandling {
/*
* Demonstrates Exception Handling
* Shows that finally clause is executed despite catching exceptions
 */
    /*
    * Takes the attributes of a drawing as arguments and throws exceptions if they are not the expected values
    * @param shape String containing the shape of the drawing
    * @param colour String containing the colour of the drawing
    * @param angle int containing the orientation of the drawing
     */
    public void exceptionThrower(String shape, String colour, int angle) throws Exception {

        if(!shape.equalsIgnoreCase("Square"))
            throw new ShapeNotFoundException("This shape does not exist.");
        if(!colour.equalsIgnoreCase("Red"))
            throw new ColourNotFoundException("This colour does not exist.");
        if(angle != 0)
            throw new InvalidOrientationException("Invalid Orientation.");
    }

    public static void main(String[] args) {

        ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            exceptionHandling.exceptionThrower("Rectangle", "Red", 0);
            exceptionHandling.exceptionThrower("Square", "Blue", 0);        //Will not be executed
            exceptionHandling.exceptionThrower("Square", "Red", 180);       //Will not be executed
        }
        catch(Exception e) {
            System.out.println(e);      //Prints out the exception with the error message defined in the respective class
        }
        finally {
            System.out.println("finally clause has been executed.");    //To show that the finally clause is executed
        }
    }
}
