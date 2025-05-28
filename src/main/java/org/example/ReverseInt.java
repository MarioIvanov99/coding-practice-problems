package org.example;

public class ReverseInt {
    public int reverse(int x) {
        String s = Integer.toString(x);

        if(s.length() == 1){
            return x;
        }
        else if(s.length() == 2 && s.charAt(0) == '-'){
            return x;
        }

        if(s.charAt(0) == '-'){
            s = "-" + reverseString(s.substring(1));
        }
        else{
            s = reverseString(s);
        }

        long l = Long.parseLong(s);

        if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int) l;
        }
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String result = new String(chars);

        int zeroSpace = 0;
        while (zeroSpace < result.length() && result.charAt(zeroSpace) == '0') {
            zeroSpace++;
        }

        return result.substring(zeroSpace);
    }
}
