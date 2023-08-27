class Solution {
    public int minOperations(List<Integer> nums, int target) {
        long sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(target>sum)return -1;
        Collections.sort(nums);
        int ops=0;
        for(int i=nums.size()-1;i>=0;i--){
            int n=nums.get(i);
            sum-=n;
            while(sum<target){
                while(n>target){
                    n/=2;
                    ops++;
                }
                target-=n;
            }
        }
        return ops;
    }
}