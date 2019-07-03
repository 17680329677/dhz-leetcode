package com.dhz.leetcode_1;

/**
 * @Author: hezhe.du
 * @Date: 2019/7/3 0003 19:51
 */

public class TitleToNumber {

    /**
     * 将excel的行名称转为数字
     * 前面题目的逆过程
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
