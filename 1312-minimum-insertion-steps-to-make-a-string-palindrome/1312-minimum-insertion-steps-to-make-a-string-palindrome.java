class Solution {
    public static int lps(String s1,String s2,int m,int n,int dp[][]){
        if(m==0 || n==0)return 0;
        
        if(dp[m][n]!=-1)return dp[m][n];
        
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dp[m][n]=1+lps(s1,s2,m-1,n-1,dp);
        }
        return dp[m][n]=Math.max(lps(s1,s2,m-1,n,dp),lps(s1,s2,m,n-1,dp));
    }
    public int minInsertions(String s) {
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[n+1][n+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        
        return n-lps(s,rev,n,n,dp);
    }
}