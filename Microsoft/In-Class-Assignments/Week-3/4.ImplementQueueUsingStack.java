class MyQueue {
    private Stack<Integer> A;
    private Stack<Integer> B;
    public MyQueue() {
        A=new Stack<>();
        B=new Stack<>();
    }
     public void push(int x) {
        A.push(x);   
    }
     public int pop() {
        if(B.isEmpty()){
            while(!A.isEmpty()){
                B.push(A.pop());
            }
        }
        return B.pop();
    }
    public int peek() {
         if(B.isEmpty()){
            while(!A.isEmpty()){
                B.push(A.pop());
            }
        }
        return B.peek();
    }
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
/*
Example 1:
Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false */
