class Solution {
    Map<Integer,List<Integer>> map=new HashMap<>();
    List<List<Integer>> res= new ArrayList<>();
    List<Integer> list= new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
            for(int j=0;j<graph[i].length;j++){
                map.get(i).add(graph[i][j]);
            }
        }
        dfs(0,n);
        return res;
    }
    public void dfs(int m,int len){
        if(m==len-1){
            list.add(m);
            res.add(new ArrayList(list));
            list.remove(Integer.valueOf(m));
            return;
        }
        list.add(m);
        for(Integer i : map.get(m)){
            dfs(i,len);
        }
        list.remove(Integer.valueOf(m));
    }
}
