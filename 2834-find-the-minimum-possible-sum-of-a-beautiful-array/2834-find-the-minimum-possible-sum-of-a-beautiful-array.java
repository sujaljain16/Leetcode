class Solution {
    public long minimumPossibleSum(int n, int target) {
        long ans=0;
        
        for(long i=1;i<=target/2;i++){
            if(n>0){
                ans+=i;
                n--;
            }
        }
        
        for(long i=target;n>0;n--,i++){
            ans+=i;
        }
        return ans;
    }
}