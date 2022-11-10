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
