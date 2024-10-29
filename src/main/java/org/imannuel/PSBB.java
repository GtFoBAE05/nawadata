package org.imannuel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        //initialize variable to save result
        int busNeeded = 0;

        //initialize list to save when there is more than four in one family
        ArrayList<Integer> remainingFamily = new ArrayList<>();

        //find number of family member is 4
        //find number of family member is 4
        for (int members : familyMembers) {
            if (members == 4) {
                //add bus needed
                busNeeded++;
            } else if (members > 4) {
                //loop if current family members if more than four
                int tempMember = members;
                while (tempMember > 0) {
                    if (tempMember - 4 >= 0) {
                        tempMember = tempMember - 4;
                        busNeeded++;
                    } else {
                        remainingFamily.add(tempMember);
                        tempMember = 0;
                    }
                }
            } else {
                //save members to remaining family
                remainingFamily.add(members);
            }
        }

        //sort family
        Collections.sort(remainingFamily);

        int firstPointer = 0;
        int lastPointer = remainingFamily.size()-1;

        //loop through remaining family
        while (firstPointer <= lastPointer) {
            //add bus needed if most small family member and most big family member can in one bus
            if (remainingFamily.get(firstPointer) + remainingFamily.get(lastPointer) <= 4) {
                busNeeded++;
                firstPointer++;
                lastPointer--;
            } else {
                //add bus needed because members too large
                busNeeded++;
                lastPointer--;
            }
        }
        return busNeeded;
    }

}
