package nishant.assignment3;

public class OuterClassTwo {

    public void getInner() {
        InnerClassTwo innerClassTwo = new InnerClassTwo();
    }

    public class InnerClassTwo extends OuterClassOne.InnerClassOne {

        public InnerClassTwo() {
            super("Hello World!");
        }
    }

    public static void main(String[] args) {

        OuterClassTwo outerClassTwo = new OuterClassTwo();
        outerClassTwo.getInner();
    }
}
