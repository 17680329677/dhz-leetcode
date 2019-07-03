package com.dhz.leetcode_1;

import java.util.HashMap;

/**
 * @Author: hezhe.du
 * @Date: 2019/7/3 0003 19:26
 */

public class MajorityElement {

    /**
     * HashMap计数法
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > nums.length/2)
                return num;
        }
        return -1;
    }

    /**
     * 摩尔投票法！！！！
     *
     * 维护一个count值和当前最多major，然后如果当前值 ==major，则累加count；
     * 如果不是，就--count，最后的答案就是major，这是最好的方法，时间复杂度O(N)，空间O(1)；
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        int count = 0;
        int major = nums[0];
        for (Integer num : nums) {
            if (num == major) count += 1;
            else if (--count == 0) {
                count = 1;
                major = num;
            }
        }
        return major;
    }
}
