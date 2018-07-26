package nishant.assignment4;

public class ExceptionHandling {

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
            System.out.println(e);
        }
        finally {
            System.out.println("finally clause has been executed.");
        }
    }
}
