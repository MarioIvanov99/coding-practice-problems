package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeats {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int max = 0;

        for(char c: s.toCharArray()){
            if(window.contains(c)){
                Math.max(max, window.size());
                window.clear();
                window.add(c);
            }
            else {
                window.add(c);
            }
        }

        return max;
    }
}
