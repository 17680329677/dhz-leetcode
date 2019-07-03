package com.dhz.leetcode_1;

/**
 * 返回 n！ 计算结果末尾包含0的个数
 * @Author: hezhe.du
 * @Date: 2019/7/3 0003 20:00
 */

public class TrailingZeroes {

    /**
     * 5 的阶乘结果是 120，零的个数为 1
     * 末尾唯一的零来自于 2 * 5。很显然，如果需要产生零，阶乘中的数需要包含 2 和 5 这两个因子。
     * 我们只要数一数组成阶乘的数中共有多少对 2 和 5 的组合即可
     * 又因为 5 的个数一定比 2 少，问题简化为计算 5 的个数
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int result = 0;
        while (n > 0) {
            result += n / 5;
            n = n / 5;
        }
        return result;
    }
}
