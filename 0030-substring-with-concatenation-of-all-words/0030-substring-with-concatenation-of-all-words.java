class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> map1=new HashMap<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            map1.put(words[i],map1.getOrDefault(words[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        int k=words[0].length()*n;
        int z=words[0].length();
        int j=0,i=0;
        while(j<s.length()){
            if(j-i+1 == k){
                String sub=s.substring(i,j+1);
                HashMap<String,Integer> map2=new HashMap<>();
                int p=0;
                while(p<sub.length()){
                    String temp=sub.substring(p,p+z);
                    map2.put(temp,map2.getOrDefault(temp,0)+1);
                    p+=z;
                }
                if(map1.equals(map2)){
                    ans.add(i);
                }
                i++;
            }
            j++;
        }
        return ans;
        
    }
}