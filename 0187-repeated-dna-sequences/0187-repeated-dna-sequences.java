class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map=new HashMap<>();
        List<String> ans=new ArrayList<>();
        if(s.length()<=10)return ans;
        int i=0,j=10;
        while(j<=s.length()){
            String sub=s.substring(i,j);
            i++;
            j++;
            map.put(sub,map.getOrDefault(sub,0)+1);
            if(map.get(sub)>1 && !ans.contains(sub)){
                ans.add(sub);
            }
        }
        return ans;
    }
}