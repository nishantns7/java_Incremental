package nishant.assignment3;

public class MainRodent {
/*
* Demonstrates abstract classes and the overriding of its methods
 */
    public static void main(String[] args) {
        Rodent arr[] = new Rodent[3];
        arr[0] = new Mouse();
        arr[1] = new Gerbil();
        arr[2] = new Hamster();
        for(Rodent i : arr) {
            i.getName();
            i.attack();
        }
    }
}
