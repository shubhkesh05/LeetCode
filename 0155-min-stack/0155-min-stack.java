class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minstack=new Stack<>();

    public MinStack() {
        
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || val<=minstack.peek()){
            minstack.push(val);
        }
        
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int remov=stack.pop();
            if(remov==minstack.peek()){
                minstack.pop();
            }
        }
        
    }
    
    public int top() {
        if(stack.isEmpty()){
            return -1;
            }
            return stack.peek();
        
        
    }
    
    public int getMin() {
        if(minstack.isEmpty()){
            return -1;
        }
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */