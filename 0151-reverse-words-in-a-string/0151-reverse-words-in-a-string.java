class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split(" ");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=""){
                ans+=arr[i]+" ";
            }
        }
        return ans.trim();
    }
}