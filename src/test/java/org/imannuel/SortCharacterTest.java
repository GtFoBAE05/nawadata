package org.imannuel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortCharacterTest {

    @Test
    void shouldReturnaaeeWhenSortCharacterFirstApproachVowelCase1(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Sample Case";
        String expectedOutput = "aaee";

        String result = sortCharacter.sortCharacterFirstApproachVowel(text);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnssmplcWhenSortCharacterFirstApproachConsonantCase1(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Sample Case";
        String expectedOutput = "ssmplc";

        String result = sortCharacter.sortCharacterFirstApproachConsonant(text);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldRetureeaWhenSortCharacterFirstApproachVowelCase2(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Next Case";
        String expectedOutput = "eea";

        String result = sortCharacter.sortCharacterFirstApproachVowel(text);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnnxtcsWhenSortCharacterFirstApproachConsonantCase2(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Next Case";
        String expectedOutput = "nxtcs";

        String result = sortCharacter.sortCharacterFirstApproachConsonant(text);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnaaeeWhenSortCharacterSecondApproachVowelCase1(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Sample Case";
        String expectedOutput = "aaee";

        String result = sortCharacter.sortCharacterSecondApproachVowel(text);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnssmplcWhenSortCharacterSecondApproachConsonantCase1(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Sample Case";
        String expectedOutput = "ssmplc";

        String result = sortCharacter.sortCharacterSecondApproachConsonant(text);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnaaeeWhenSortCharacterSecondApproachVowelCase2(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Next Case";
        String expectedOutput = "eea";

        String result = sortCharacter.sortCharacterSecondApproachVowel(text);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnWhenSortCharacterSecondApproachConsonantCase2(){
        SortCharacter sortCharacter = new SortCharacter();
        String text = "Next Case";
        String expectedOutput = "nxtcs";

        String result = sortCharacter.sortCharacterSecondApproachConsonant(text);
        assertEquals(expectedOutput, result);
    }

}