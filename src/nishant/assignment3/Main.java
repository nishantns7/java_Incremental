package nishant.assignment3;

public class Main extends ConcreteSuper implements Int4 {
    @Override
    public void method7() {
        System.out.println("Method7");
    }

    @Override
    public void method1() {
        System.out.println("Method1");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }

    @Override
    public void method3() {
        System.out.println("Method3");
    }

    @Override
    public void method4() {
        System.out.println("Method4");
    }

    @Override
    public void method5() {
        System.out.println("Method5");
    }

    @Override
    public void method6() {
        System.out.println("Method6");
    }

    public void meth1(Int1 obj) {
        System.out.println("Interface 1\n");
        obj.method1();
        obj.method2();
//        obj.method4();            //Interface 1 does not have the method, method4
    }

    public void meth2(Int2 obj) {
        System.out.println("\n\n\nInterface 2\n");
        obj.method3();
        obj.method4();
//        obj.method2();            //Interface 2 does not have the method, method2
    }

    public void meth3(Int3 obj) {
        System.out.println("\n\n\nInterface 3\n");
        obj.method5();
        obj.method6();
//        obj.method3();            //Interface 3 does not have the method, method3
    }

    public void meth4(Int4 obj) {
        System.out.println("\n\n\nInterface 4\n");
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();              //Interface 4 inherits from all the other 3 and so can use all 6 of their methods, plus its own
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.meth1(main);
        main.meth2(main);
        main.meth3(main);
        main.meth4(main);
    }
}
