class MyHashSet {
    ArrayList<Node>[] arr;
    public class Node{
        int val;
        public Node(int val){
            this.val=val;
        }
    }
    public MyHashSet() {
        arr=new ArrayList[10001];
    }
    
    public void add(int key) {
        int index=key/100;
        if(arr[index]==null){
            arr[index]=new ArrayList<Node>();
            arr[index].add(new Node(key));
        }else{
            for(Node e:arr[index]){
                if(e.val==key){
                    return;
                }
            }
            arr[index].add(new Node(key));
            return;
        }
    }
    
    public void remove(int key) {
       int index=key/100;
       if(arr[index]==null){
           return;
       } 
       for(Node e:arr[index]){
           if(e.val==key){
               arr[index].remove(e);
               return;
           }
       }
    }
    
    public boolean contains(int key) {
        int index=key/100;
        if(arr[index]==null){
            return false;
        }else{
            for(Node e:arr[index]){
                if(e.val==key){
                    return true;
                }
            }
        }
        return false;
    }
}
/*
Example 1:
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)  */
