package com.gowri.dsa;
public class ValidAnagramOptimal {

    //Time Complexity: O(n) since we traverse the strings only once
    //Space Complexity: O(1) since we are using fixed size array of 26

    public boolean isAnagram(String s, String t) {
        
        //using optimal solution since the problem says 
        // we have only lower case possibility
        if(s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];
        int base = 'a';

        for(int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - base]++;
            charCount[t.charAt(i) - base]--;
        }

        for(int count: charCount) {
            if(count !=0) {
                return false;
            }
        }

        return true;

    }
    
}
