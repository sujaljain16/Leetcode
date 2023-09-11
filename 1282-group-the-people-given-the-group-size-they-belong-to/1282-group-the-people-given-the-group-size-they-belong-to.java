class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i],new ArrayList<>());
            }
            List<Integer> grp=map.get(groupSizes[i]);
            grp.add(i);
            if(grp.size()==groupSizes[i]){
                ans.add(grp);
                map.remove(groupSizes[i]);
            }
        }
        return ans;
    }
}