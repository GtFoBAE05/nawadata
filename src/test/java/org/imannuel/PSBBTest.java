package org.imannuel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PSBBTest {

    @Test
    void shouldReturnFourWhenPSBBWithTestCase1(){
        PSBB psbb = new PSBB();
        String numberOfFamilies = "5";
        String membersInFamily = "1 2 4 3 3";
        Integer expectedOutput = 4;

        Integer result = psbb.psbb(numberOfFamilies, membersInFamily);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnFiveWhenPSBBWithTestCase2(){
        PSBB psbb = new PSBB();
        String numberOfFamilies = "8";
        String membersInFamily = "2 3 4 4 2 1 3 1";
        Integer expectedOutput = 5;

        Integer result = psbb.psbb(numberOfFamilies, membersInFamily);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnEightWhenPSBBWithCustomTestCase(){
        PSBB psbb = new PSBB();
        String numberOfFamilies = "5";
        String membersInFamily = "5 5 5 5 8";
        Integer expectedOutput = 8;

        Integer result = psbb.psbb(numberOfFamilies, membersInFamily);
        assertEquals(expectedOutput, result);
    }

    @Test
    void shouldReturnMinusOneWhenPSBBInvalid(){
        PSBB psbb = new PSBB();
        String numberOfFamilies = "5";
        String membersInFamily = "1 2";
        Integer expectedOutput = -1;

        Integer result = psbb.psbb(numberOfFamilies, membersInFamily);
        assertEquals(expectedOutput, result);
    }

}