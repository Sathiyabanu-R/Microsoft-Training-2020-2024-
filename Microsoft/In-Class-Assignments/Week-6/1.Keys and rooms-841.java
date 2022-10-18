class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      if(rooms==null || rooms.size()==0){
          return false;
      }  
        Set<Integer>visited=new HashSet<>();
        visitDFS(rooms,0,visited);
        return visited.size()==rooms.size();
        }
    private void visitDFS(List<List<Integer>>rooms,Integer i,Set<Integer>visited){
        if(visited.contains(i)) return ;
        visited.add(i);
        for(Integer key:rooms.get(i)){
            visitDFS(rooms,key,visited);
        }
    }
    private void visitBFS(List<List<Integer>>rooms,Integer i,Set<Integer>visited){
        Queue<Integer>queue=new ArrayDeque<>();
        queue.offer(i);
        while(!queue.isEmpty()){
            Integer key=queue.poll();
            visited.add(key);
            for(Integer k: rooms.get(key)){
                if(!visited.contains(k)){
                    queue.offer(k);
                }
            }
        }
    }
}
/*
Example 1:
Input: rooms = [[1],[2],[3],[]]
Output: true
Explanation: 
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.

Example 2:
Input: rooms = [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.
*/
