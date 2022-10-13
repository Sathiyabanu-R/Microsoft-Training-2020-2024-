class MyHashMap {
    ArrayList<Node>[] arr; 
    class Node{
        int key;
        int val;
        public Node(int key,int val){
          this.key=key;
          this.val=val;
        }
    }
    public MyHashMap() {
        arr=new ArrayList[10001];
    }
    
    public void put(int key, int value) {
        int index=key/100;
        if(arr[index]==null){
            arr[index]=new ArrayList<Node>();
            arr[index].add(new Node(key,value));
            return;
        }else{
            for(Node e:arr[index]){
                if(e.key==key){
                    e.val=value;
                    return;
                }
            }
            arr[index].add(new Node(key,value));
        }
    }
    
    public int get(int key) {
        int index=key/100;
        if(arr[index]==null){
            return -1;
        }
        else{
            for(Node e:arr[index]){
                if(e.key==key){
                    return e.val;
                }
            }
            return -1;
        }
    }
    
    public void remove(int key) {
        int index=key/100;
        if(arr[index]==null){
            return;
        }
            for(Node e:arr[index]){
                if(e.key==key){
                    arr[index].remove(e);
                    return;
                }
            }
        
    }
}
/*
Example 1:
Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
*/
