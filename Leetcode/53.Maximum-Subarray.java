class Solution {
    
    public int maxSubArray(int[] nums) {
      // ** Kadane's algorithm **
        int l = nums.length;
        int localMax = 0, globalMax = Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            localMax=Math.max(localMax+nums[i], nums[i]);
            globalMax=Math.max(globalMax, localMax);
        }
        return globalMax;
    }
    
    public int maxSubArray2(int[] nums){
      // ** Dynamic Programming **
        int dp[] = new int[len];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i=1;i<len;i++){                                                                
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0); //discard all negative numbers as they will reduce maxSum
             max = Math.max(max,dp[i]);                     // finding max of all numbers in the table
                
        }
        return max;
    }
}
