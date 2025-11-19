package com.gowri.dsa;

//Time Complexity: 0(n) due to traversing the array n times.
//Space Complexity:  O(1) since we are using only constant space.
public class FindMinMax {

    public static int[] findMinMax(int[] nums) { 

        if(nums == null || nums.length ==0) {
            throw new IllegalArgumentException("Given Array is null or empty");
        }

        int min = nums[0];
        int max = nums[0];

        for(int i =1; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            } 
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return new int[]{min, max};
    }
    
    
}
