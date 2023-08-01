class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())return -1;
        int k=0;
        for(int i=0;i<haystack.length();i++){
            String sub="";
            if(haystack.charAt(i)==needle.charAt(0)){
                if((i+needle.length()>haystack.length()))
                    sub=haystack.substring(i);
                else
                     sub=haystack.substring(i,i+needle.length());
            }
               if(sub.equals(needle)){
                    return i;
               }
        }
        return -1;
    }
}
               
        
    