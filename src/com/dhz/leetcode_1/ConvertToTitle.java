package com.dhz.leetcode_1;

/**
 * @Author: hezhe.du
 * @Date: 2019/7/2 0002 20:15
 */

public class ConvertToTitle {
    /**
     * 给定一个正整数，将其转换为excel的行标 A...AZ
     * @param n
     * @return
     */
    public String convertToTitle(int n) {
        String s = "";
        while (n != 0) {
            int temp = (n-1) % 26;
            s = (char) ('A' + temp) + s;
            n = (n-1) / 26;
        }
        return s;
    }

    public static void main(String[] args) {
       ConvertToTitle convert = new ConvertToTitle();
       System.out.println(convert.convertToTitle(26));
    }
}


