class Solution {
    static int dp[][]=new int[101][101];
    static int n,m;
    static int dfs(int i,int j,String s1, String s2, String s3){
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(i==n && j==m)return 1;
        
        if(i<n && s1.charAt(i)==s3.charAt(i+j) && j<m && s2.charAt(j)==s3.charAt(i+j)){
            return dp[i][j]=dfs(i+1,j,s1,s2,s3) | dfs(i,j+1,s1,s2,s3);
        }
        if(i<n && s1.charAt(i)==s3.charAt(i+j)){
            return dp[i][j]=dfs(i+1,j,s1,s2,s3);
        }
        if(j<m && s2.charAt(j)==s3.charAt(i+j)){
            return dp[i][j]=dfs(i,j+1,s1,s2,s3);
        }
        return dp[i][j]=0;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        n=s1.length();
        m=s2.length();
        if((n+m)!=s3.length())return false;
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        if(dfs(0,0,s1,s2,s3)==0){
            return false;
        }
        return true;
    }
}