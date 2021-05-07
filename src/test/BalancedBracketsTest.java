package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
//"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "",
    @Test
    public void bracketsEnclosingWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsEnclosingPartialWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsEnclosedBeforeWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //"[LaunchCode", "Launch]Code[", "[", "]["
    @Test
    public void onlyLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void oneLeftAndRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void oneLeftBracketBeforeWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void oneLeftBracketBeforeRight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void oneLeftLeftRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launch[]"));
    }

}
//""
//"[]"
//"[LaunchCode]"
//"Launch[Code]"
//"[]LaunchCode"
//"[]LaunchCode[]"
//"[[LaunchCode]]"
//"]["
//"[LaunchCode"
//"Launch]Code["
//"["
//"[launch[]"
//"[launch[]"
//"]launch[]"