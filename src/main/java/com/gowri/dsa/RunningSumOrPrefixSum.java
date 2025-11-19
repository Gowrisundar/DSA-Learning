package com.gowri.dsa;

//Time Complexity: O(n) since we traverse the array only once
//Space Complexity: O(1) since we are using only a fixed size array for result
public class RunningSumOrPrefixSum {

    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] runningSumArray = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            runningSumArray[i]=sum;
        }

        return runningSumArray;
    }
    
}
