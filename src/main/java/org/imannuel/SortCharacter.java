package org.imannuel;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortCharacter {
    private static final String vowel = "aiueo";
    private static final String consonant = "bcdfghjklmnpqrstvwxyz";

    // first approach, using string builder
    public String sortCharacterFirstApproachVowel(String text) {
        //create variable to save the result
        StringBuilder vowelChar = new StringBuilder();

        //update text to lowercase and save it to char array
        char[] charText = text.toLowerCase().toCharArray();

        //loop through array
        for (char c : charText) {
            //check if c is vowel or consonant
            if (vowel.contains(String.valueOf(c))) {
                //find index of the character in vowelChar
                int i = vowelChar.indexOf(String.valueOf(c));

                //check is character already in vowerChar or not
                //will return -1 if not found
                if (i == -1) {
                    //append to vowelchar if no character inside vowelchar
                    vowelChar.append(c);
                } else {
                    //append to vowelchart based on index of character
                    vowelChar.insert(i, c);
                }
            }
        }
        return vowelChar.toString();
    }

    public String sortCharacterFirstApproachConsonant(String text) {
        //create variable to save the result
        StringBuilder consonantChar = new StringBuilder();

        //update text to lowercase and save it to char array
        char[] charText = text.toLowerCase().toCharArray();

        //loop through array
        for (char c : charText) {
            //check if c is vowel or consonant
            if (consonant.contains(String.valueOf(c))) {
                //find index of the character in consonantChar
                int i = consonantChar.indexOf(String.valueOf(c));

                //check is character already in consonantChar or not
                //will return -1 if not found
                if (i == -1) {
                    //append to consonantChar if no character inside consonantChar
                    consonantChar.append(c);
                } else {
                    //append to consonantChar based of index of the character
                    consonantChar.insert(i, c);
                }
            }
        }
        return consonantChar.toString();
    }

    // second approach
    public String sortCharacterSecondApproachVowel(String text) {
        //create variable to save the result
        StringBuilder vowelChar = new StringBuilder();

        //update text to lowercase and save it to char array
        char[] charText = text.toLowerCase().toCharArray();

        //create linkedhashmap for save the first appearance character and number of appearance
        //used linkedhashmap because linkedhashmap will save it in order
        //if using hashmap, it will not guarante will save in order
        LinkedHashMap<Character, Integer> vowelHashMap = new LinkedHashMap<>();

        //loop every character in text
        for (char c : charText) {
            //check if character is vowel
            if (vowel.contains(String.valueOf(c))) {
                //save character to linkedhashmap
                //if no character before, it will save and put count as 0(default value) and plus 1
                //otherwise if already inside, it will get saved count before and increment it by one
                vowelHashMap.put(c, vowelHashMap.getOrDefault(c, 0) + 1);
            }
        }

        //put the vowelhashmap into the result for vowel
        for (Map.Entry<Character, Integer> characterEntry : vowelHashMap.entrySet()) {
            //append the key of the character to vowelChar
            //sum to append character is based on value of key saved hashmap
            vowelChar.append(characterEntry.getKey().toString().repeat(characterEntry.getValue()));
        }

        return vowelChar.toString();
    }

    public String sortCharacterSecondApproachConsonant(String text) {
        //create variable to save the result
        StringBuilder consonantChar = new StringBuilder();

        //update text to lowercase and save it to char array
        char[] charText = text.toLowerCase().toCharArray();

        //create linkedhashmap for save the first appearance character and number of appearance
        //used linkedhashmap because linkedhashmap will save it in order
        //if using hashmap, it will not guarante will save in order
        LinkedHashMap<Character, Integer> consonantHashMap = new LinkedHashMap<>();

        //loop every character in text
        for (char c : charText) {
            //check if character is consonant
            if (consonant.contains(String.valueOf(c))) {
                consonantHashMap.put(c, consonantHashMap.getOrDefault(c, 0) + 1);
            }
        }
        //put the consonanthashmap into the result for consonant
        for (Map.Entry<Character, Integer> characterEntry : consonantHashMap.entrySet()) {
            //append the key of the character to consonant
            //sum to append character is based on value of key saved hashmap
            consonantChar.append(characterEntry.getKey().toString().repeat(characterEntry.getValue()));
        }

        return consonantChar.toString();
    }

}
