package com.company;

public class StringCompression {


    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        String res = "";
        int counter = 1;
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] ==chars[i-1]){
                counter++;
            }else {
                if(counter == 1){
                    res += chars[i-1];
                }else {
                    res += chars[i-1];
                    res += counter;
                }
                counter=1;
            }
        }
        if(counter > 1){
            res += chars[chars.length-1];
            res += counter;
        }else {
            res += chars[chars.length-1];
        }
        char[] temp = res.toCharArray();
        for (int i = 0; i < temp.length; ++i) {
            chars[i] = temp[i];
        }
        return temp.length;
    }
}
