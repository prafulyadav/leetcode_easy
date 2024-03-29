class Solution {
    public int rob(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        int[] circutBreaker1 = Arrays.copyOfRange(nums, 0, nums.length-1);
        int[] circutBreaker2 = Arrays.copyOfRange(nums, 1, nums.length);
        return Math.max(robSub(circutBreaker1), robSub(circutBreaker2));
    }
    
    private int robSub(int[] nums) {
        int[] dp = new int[nums.length+2];
        dp[0]=0;
        dp[1]=0;
        for (int i=2; i<dp.length; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i-2], dp[i-1]);
        }
        return dp[dp.length-1];
    }
}