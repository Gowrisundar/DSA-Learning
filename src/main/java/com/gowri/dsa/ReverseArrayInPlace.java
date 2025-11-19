package com.gowri.dsa;

public class ReverseArrayInPlace {

    public static int[] reverseArray(int[] nums) {
        if(nums == null || nums.length==0) {
            throw new IllegalArgumentException("Given Array is null or Empty");
        }
        for(int i =0,j=nums.length-1; i<j; i++,j--) {  
                int tmp = nums[i];
                nums[i]=nums[j];     
        }
        return nums;
    }
    
}
