class MyCircularQueue {
     int[] q;
    int front=0,rear=-1,len=0;
    public MyCircularQueue(int k) {
        q=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            rear=(rear+1)%q.length;
            q[rear]=value;
            len++;
            return true;
        }
        else 
            return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            front=(front+1)%q.length;
            len--;
            return true;
        }
        else
            return false;
    }
    
    public int Front() {
        return isEmpty()?-1:q[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:q[rear];
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==q.length;
    }
}
/* 
Example 1:
Input
["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]
Output
[null, true, true, true, false, 3, true, true, true, 4]

Explanation
MyCircularQueue myCircularQueue = new MyCircularQueue(3);
myCircularQueue.enQueue(1); // return True
myCircularQueue.enQueue(2); // return True
myCircularQueue.enQueue(3); // return True
myCircularQueue.enQueue(4); // return False
myCircularQueue.Rear();     // return 3
myCircularQueue.isFull();   // return True
myCircularQueue.deQueue();  // return True
myCircularQueue.enQueue(4); // return True
myCircularQueue.Rear();     // return 4
 */
