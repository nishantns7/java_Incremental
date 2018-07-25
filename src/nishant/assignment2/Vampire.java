package nishant.assignment2;

import java.util.Arrays;

public class Vampire {
/*
* Prints out the first 100 Vampire numbers
* Vampire numbers must have even number of digits
* They must have a factor pair, each having half the number of digits of the original number
* There must not be trailing zeroes on both the factors of the pair
* The digits of the factor pair must be the same as that of the original number
 */
    public static void main(String[] args) {

        int vampireList[] = vampireLister();
        for (int i : vampireList)
            System.out.println(i);
    }

    /*
    * Iterates over natural numbers until 100 vampire numbers are encountered
    * Starts with 2 digit numbers and multiplies the number by 10 each time a number with odd number of digits is encountered
    * Returns an integer array containing the first 100 vampire numbers
     */
    public static int[] vampireLister() {

        int number = 10;
        int i = 0;
        int vampireList[] = new int[100];
        while(i<100) {
            while(true) {
                if((int)Math.log10(number) % 2 == 0) {
                    number *= 10;
                }
                else
                    if(vampireChecker(number)) {
                        vampireList[i] = number;
                        i++;
                        number++;
                        break;
                    }
                    else
                        number++;
            }
        }
        return vampireList;
    }

    public static boolean vampireChecker(int number) {

        int factors[] = new int[2];
        for(int i = 1; i <= (int)Math.sqrt(number); i++) {
            if(number % i == 0)
                if((int)Math.log10(i) + 1 == ((int)Math.log10(number) + 1) / 2 && (int)Math.log10(number / i) + 1 == ((int)Math.log10(number) + 1) / 2) {
                    factors[0] = i;
                    factors[1] = number / i;
                    if(!(factors[0] % 10 == 0 && factors[1] % 10 == 0))
                        if(digitMatcher(number, factors))
                            return true;
                }
        }
        return false;
    }

    public static boolean digitMatcher(int number, int... factors) {
        int digits1[] = new int[(int)Math.log10(number) + 1];
        int digits2[] = new int[(int)Math.log10(number) + 1];
        int i = 0, j = ((int)Math.log10(number) + 1) / 2;
        while(number > 0) {
            digits1[i] = number % 10;
            number /= 10;
            i++;
        }
        i=0;
        while(factors[0] > 0) {
            digits2[i] = factors[0] % 10;
            digits2[j] = factors[1] % 10;
            factors[0] /= 10;
            factors[1] /= 10;
            i++;
            j++;
        }
        Arrays.sort(digits1);
        Arrays.sort(digits2);
        return Arrays.equals(digits1, digits2);
    }
}
