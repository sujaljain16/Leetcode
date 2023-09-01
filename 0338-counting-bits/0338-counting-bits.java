class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        int off=1;
        for(int i=1;i<n+1;i++){
            if(off*2==i){
                off*=2;
            }
            res[i]=res[i-off]+1;
        }
        return res;
    }
}