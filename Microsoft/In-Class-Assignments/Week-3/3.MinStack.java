class MinStack {
    Stack<Integer> stack;
    Stack<Integer> s;

    public MinStack() {
        this.stack=new Stack<>();
        this.s=new Stack<>(); 
    }
    
    public void push(int val) {
        stack.push(val);
        if(s.isEmpty()==true || s.peek()>=val){
            s.push(val);
        }
    }
    
    public void pop() {
        int val=stack.pop();
        if(s.isEmpty()==false && s.peek()==val){
            s.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return s.peek();
    }
}
/*
Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2  */
