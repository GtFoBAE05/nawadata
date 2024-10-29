package org.imannuel;

import java.util.Arrays;

public class PSBB {

    public Integer psbb(String numberOfFamily, String membersOfFamily) {
        //parse string numberOfFamily to integer
        int familyNumber = Integer.parseInt(numberOfFamily);

        //split membersOfFamily to an array, so we know each of member in family
        String[] familyMemberSplitted = membersOfFamily.split(" ");

        //parse familyMemberSplitted from string to array
        int[] familyMembers = Arrays.stream(familyMemberSplitted).mapToInt(Integer::parseInt).toArray();

        //check if familyNumber is same with familyMembers
        if (familyNumber != familyMembers.length) {
            //print error handling if its not equal
            System.out.println("Input must be equal with count of family\n");
            return -1;
        }

        //sum total of family members
        int sumOfFamilyMembers = Arrays.stream(familyMembers).sum();

        //divide it the sum of family member with 4(limit of passenger in one car)
        //cast to double because value of divide may be not decimal
        //use ceil to round it
        return (int) Math.ceil((double) sumOfFamilyMembers / 4);
    }
}
