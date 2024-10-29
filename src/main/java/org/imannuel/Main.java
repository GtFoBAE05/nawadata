package org.imannuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initialize
        Scanner scanner = new Scanner(System.in);
        int menuOption;

        SortCharacter sortCharacter = new SortCharacter();
        PSBB psbb = new PSBB();

        do {
            System.out.println("=".repeat(20));
            System.out.println("Nawadata logic test");
            System.out.println("1. Sort Character(NDL010) - first approach (using string builder index)");
            System.out.println("2. Sort Character(NDL010) - second approach (using linked hash map)");
            System.out.println("3. PSBB(NDL011");
            System.out.println("4. Exit");
            System.out.print("Input the option of the menu: ");
            menuOption = scanner.nextInt();
            scanner.nextLine();

            switch (menuOption) {
                case 1:
                    System.out.print("Input one line of words (S): ");
                    String textToFindFirstApproach = scanner.nextLine();
                    System.out.println();
                    String resultVowelFirstApporach = sortCharacter.sortCharacterFirstApproachVowel(textToFindFirstApproach);
                    String resultConsonantFirstApporach = sortCharacter.sortCharacterFirstApproachConsonant(textToFindFirstApproach);
                    System.out.printf("Vowel characters: \n%s\n", resultVowelFirstApporach);
                    System.out.printf("Consonant characters: \n%s\n", resultConsonantFirstApporach);
                    break;
                case 2:
                    System.out.print("Input one line of words (S): ");
                    String textToFindSecondApproach = scanner.nextLine();
                    System.out.println();
                    String resultVowelSecondApporach = sortCharacter.sortCharacterSecondApproachVowel(textToFindSecondApproach);
                    String resultConsonantSecondApporach = sortCharacter.sortCharacterSecondApproachConsonant(textToFindSecondApproach);
                    System.out.printf("Vowel characters: \n%s\n", resultVowelSecondApporach);
                    System.out.printf("Consonant characters: \n%s\n", resultConsonantSecondApporach);
                    break;
                case 3:
                    System.out.print("Input the number of families: ");
                    String numberOfFamilies = scanner.nextLine();
                    System.out.print("Input the number of members in the family: ");
                    String numberOfMembersFamily = scanner.nextLine();
                    System.out.println();
                    Integer minimumCarNeeded = psbb.psbb(numberOfFamilies, numberOfMembersFamily);
                    if(minimumCarNeeded != -1){
                        System.out.printf("Minimum bus required is: %d\n", minimumCarNeeded);
                    }
                    break;
                case 4:
                    System.out.println("Thankyou");
                    break;
            }
        } while (menuOption != 4);

        scanner.close();
    }
}