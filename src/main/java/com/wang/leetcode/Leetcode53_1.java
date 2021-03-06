package com.wang.leetcode;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路： f(i)表示以第i个数结尾的连续子数组的最大和
 */
public class Leetcode53_1 {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
            sum = Math.max(nums[i],sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Leetcode53_1 leetcode53_1 = new Leetcode53_1();
        System.out.println(leetcode53_1.maxSubArray(arr));
    }
}
