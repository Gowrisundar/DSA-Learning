package com.gowri.dsa;

public class ValidAnagramHashMap {

    //Time Complexity: O(n) since we traverse the strings only once
    //Space Complexity: O(K) since we are using hash map to store *distinct* character counts. We may have to store all unique characters in worst case.

    public boolean isAnagram(String s, String t) {
        
        //solution using hashMap

        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            Integer count = charCountMap.get(currentChar);
            if(count == null || count == 0) {
                return false;
            } else {
                charCountMap.put(currentChar, charCountMap.get(currentChar) - 1);
            }
        }

        return true;

    }
}
