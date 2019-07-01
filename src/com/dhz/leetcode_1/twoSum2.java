package com.dhz.leetcode_1;

/**
 * @Author: hezhe.du
 * @Date: 2019/7/1 0001 20:27
 */

public class twoSum2 {
    /**
     *首先创建左右两个指针，分别指向数组的首尾元素，
     * 先对右指针进行处理，默认的条件是target = numbers[l] + numbers[r]，
     * 所以numbers[r] = target - numbers[l]，我们对不符合该条件（大于）的元素进行排除，
     * 处理之后的右指针指向的元素应该满足numbers[r] <= target - numbers[l]，
     * 然后对左右指针之间的元素进行筛选（包括左右指针的元素），
     * 当二者之和小于target时，左指针自增1，大于target时，右指针自减1，等于时跳出循环，
     * 最后按顺序返回两个指针+1
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (right > 0 && target-numbers[left] < numbers[right])
            right--;
        while (left < right) {
            if (target == numbers[left] + numbers[right]) break;
            if (target > numbers[left] + numbers[right]) left++;
            else right--;
        }
        result[0] = left + 1;
        result[1] = right + 1;
        return result;
    }
}
