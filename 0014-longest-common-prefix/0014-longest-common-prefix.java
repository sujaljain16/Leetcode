class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int len=Math.min(s1.length(),s2.length());
        int ind=0;
        while(ind<len){
            if(s1.charAt(ind)==s2.charAt(ind)){
                ind++;
            }else{
                break;
            }
        }
        return s1.substring(0,ind);
    }
}