package com.ausky.training.algorithm.sort.select;

import com.ausky.training.algorithm.sort.Sort;

/**
 * 选择排序
 * <p>
 * 选择排序的思路：
 * 从0开始遍历找出最小的，然后放到第0位，
 * 从1开始遍历找到最小的，然后放入到第1位
 * 。。。。。
 * 一直到找到最后一个
 * 完成排序
 * <p>
 * 时间复杂度是N*N
 * <p>
 * todo:这个算法是不稳定的，但是是否可以有稳定的算法实现呢？
 */
public class SelectSort implements Sort {

    public int[] sort(int[] targetArr) {

        for (int i = 0; i < targetArr.length; i++) {
            int minIndex = findMinIndex(targetArr, i);
            swap(targetArr, i, minIndex);
        }

        return targetArr;
    }

    /**
     * 查询最小元素的值
     *
     * @param targetArr
     * @param startIndex
     */
    private int findMinIndex(int[] targetArr, int startIndex) {
        int result = startIndex;
        int minVal = targetArr[startIndex];
        for (int i = startIndex; i < targetArr.length; i++) {
            if (targetArr[i] < minVal) {
                minVal = targetArr[i];
                result = i;
            }
        }
        return result;
    }

    /**
     * 进行数据交换
     *
     * @param targetArr
     * @param firstIndex
     * @param secondIndex
     */
    private void swap(int[] targetArr, int firstIndex, int secondIndex) {
        int tmp = targetArr[firstIndex];
        targetArr[firstIndex] = targetArr[secondIndex];
        targetArr[secondIndex] = tmp;
    }
}
