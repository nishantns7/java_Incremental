package nishant.assignment3;

public class MainCycle {

    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();
        Cycle arr[] = {uni, bi, tri};       //Upcasts the objects to type Cycle
/*        for (Cycle i : arr)               //Will not compile because class Cycle does not have a balance() method
            i.balance();*/
        ((Unicycle)arr[0]).balance();
        ((Bicycle)arr[1]).balance();
//        ((Tricycle)arr[2]).balance();     //Will not compile because class Tricycle does not have a balance() method
    }
}
