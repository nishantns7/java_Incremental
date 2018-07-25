package nishant.assignment2;

import org.junit.Test;

import static org.junit.Assert.*;

public class VampireTest {

    @Test
    public void vampireChecker() {
        assertTrue(Vampire.vampireChecker(1260));       //First vampire number
        assertTrue(Vampire.vampireChecker(336960));     //100th vampire number
        assertFalse(Vampire.vampireChecker(1345));      //Random non-vampire number
        assertFalse(Vampire.vampireChecker(126000));    //Trailing zeroes in the factors invalidate it
        assertFalse(Vampire.vampireChecker(1023));      //Digits of the fangs don't match with the number's digits
    }

    @Test
    public void digitMatcher() {
        assertTrue(Vampire.digitMatcher(1260,21,60));       //Valid vampire number with matching digits
        assertTrue(Vampire.digitMatcher(30,3,0));           //Invalid vampire number, but with matching digits
        assertFalse(Vampire.digitMatcher(1023,31,33));      //Would have been valid, had the digits matched
        assertFalse(Vampire.digitMatcher(5,2,3));           //Mismatch
    }

    @Test
    public void vampireLister() {
        assertEquals(100, Vampire.vampireLister().length);          //Checks if 100 vampire numbers are returned
    }
}