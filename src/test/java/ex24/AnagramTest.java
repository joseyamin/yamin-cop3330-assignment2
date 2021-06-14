package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagramReturnTrue() {
        Anagram anagram=new Anagram();

        boolean expected=true;
        boolean actual=anagram.isAnagram("note","tone");

        assertEquals(expected,actual);
    }

    @Test
    void isAnagramReturnFalse() {
        Anagram anagram=new Anagram();

        boolean expected=false;
        boolean actual=anagram.isAnagram("note","ton");

        assertEquals(expected,actual);
    }
}