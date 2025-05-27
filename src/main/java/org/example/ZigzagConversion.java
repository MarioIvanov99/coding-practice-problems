package org.example;

public class ZigzagConversion {
    int str_index = 0;
    int next = 1;

    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        String[] array = new String[numRows];
        initArray(array, numRows);
        for(int i = 0; i < s.length(); i++){
            array[str_index] += s.charAt(i);
            setCurrent(str_index, numRows);
        }
        return String.join("", array);
    }

    private void initArray(String[] array, int numRows){
        for(int i = 0; i < numRows; i++){
            array[i] = "";
        }
    }

    private void setCurrent(int current, int numRows){
        if(current == 0){
            next = 1;
        }
        if(current == numRows-1){
            next = -1;
        }

        str_index = current+next;
    }
}
