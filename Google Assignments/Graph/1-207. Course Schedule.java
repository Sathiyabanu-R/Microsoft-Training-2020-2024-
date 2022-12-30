class Solution {
    List<Integer>[] adj;
    boolean[] visited;
    boolean[] degree;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            adj[i]=new ArrayList<>();
        }
        visited = new boolean[numCourses];
        degree = new boolean[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(isCyclic(i)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean isCyclic(int i){
        visited[i]=true;
        for(Integer j:adj[i]){
            if(!visited[j]){
                if(isCyclic(j)){
                    return true;
                }
            }
            else if(!degree[j]){ 
                return true;
            }
        }
        degree[i]=true;
        return false;
    }
}
