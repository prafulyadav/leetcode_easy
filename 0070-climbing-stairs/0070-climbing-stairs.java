class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return rec(n);
    }
    
      public int rec(int n){
        if(dp[n]==-1)
   {
       int r=0;
       if(n==0 || n==1 || n==2)
       {
           return r=n;
       }
       else
       {
           dp[n]=rec(n-1)+rec(n-2);
       }
         
   }
          return dp[n];  
   }
    }
