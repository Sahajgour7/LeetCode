class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int Sum = 0;
        for (int sum = 0; sum < nums.length; sum++) {
            if (Sum < 0) {
                Sum = nums[sum];
            } else {
                Sum += nums[sum];
            }
            if(Sum > maxSum){
                maxSum = Sum;
            }
       }
       return maxSum;
    }
}