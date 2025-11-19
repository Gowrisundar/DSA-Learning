package com.gowri.dsa;

//Time Complexity: O(n) since we traverse n times through the Array
//space Complexity: O(1) since we use the same Array for inplace traversal. Given Array length is constant
public class ReverseString {

    public static int[] reverseArray(int[] nums) {
        if(nums == null || nums.length==0) {
            throw new IllegalArgumentException("Given Array is null or Empty");
        }
        for(int i =0,j=nums.length-1; i<j; i++,j--) {  
                int tmp = nums[i];
                nums[i]=nums[j]; 
                nums[j]=tmp;    
        }
        return nums;
    }
    
}

    

