package com.gowri.dsa;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class TwoSums 
{
    public int[] twoSum(int[] nums, int target) {

        //using Hash Map pattern

        Map<Integer, Integer> valueToIndexMap = new HashMap<Integer, Integer>();

        int length = nums.length;

        for(int i =0; i<length; i++) {
            int complement = target - nums[i];
            int currentValue = nums[i];

            if(valueToIndexMap.containsKey(complement)) {
                return new int[] { valueToIndexMap.get(complement), i};
            } 
            valueToIndexMap.put(currentValue, i);
        }

        return new int[0];

    }
}
