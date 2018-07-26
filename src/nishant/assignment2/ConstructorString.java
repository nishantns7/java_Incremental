package nishant.assignment2;

public class ConstructorString {

    public ConstructorString(String str) {
        System.out.println(str);
    }

    public static void main( String[] args) {
        ConstructorString obj[] = new ConstructorString[5];
        for(ConstructorString i : obj)
            i = new ConstructorString("Hello World!");
    }
}
