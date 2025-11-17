package com.gowri.dsa;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        //solved using hashset
        // same can be solved using hash map also. Logic is same as two sum problem.
        // Logic: if(seenValuesMap.containsKey(currentValue)) return true; else seenValuesMap.put(currentValue, true);
        Set<Integer> seenValues = new HashSet<Integer>();

        for(int i=0; i< nums.length; i++) {
            int currentValue = nums[i];

            if(seenValues.contains(currentValue)) {
                return true;
            }

            seenValues.add(currentValue);
        }

        return false;
        
    }
}
