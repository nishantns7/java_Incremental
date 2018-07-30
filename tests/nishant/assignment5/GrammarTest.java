package nishant.assignment5;

import org.junit.Test;

import static org.junit.Assert.*;

public class GrammarTest {

    @Test
    public void grammarChecker() {
        assertTrue(Grammar.grammarChecker("Hi, nice to meet you."));        //Single valid sentence
        assertTrue(Grammar.grammarChecker("In computing, time-sharing is the sharing of a computing resource among many users by means of multiprogramming and multi-tasking at the same time."));      //Multiple sentences
        assertTrue(Grammar.grammarChecker("A........"));        //Valid as far as given conditions are considered
        assertFalse(Grammar.grammarChecker("hello."));          //Does not begin with an uppercase character
        assertFalse(Grammar.grammarChecker("Hello!"));          //Does not end with a period
        assertFalse(Grammar.grammarChecker("@Hello."));         //Does not begin with an alphabet
    }
}