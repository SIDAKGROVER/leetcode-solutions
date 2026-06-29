class MyStack {
    Queue<Integer>q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        int size=q.size();
        for(int i=0;i<size-1;i++){
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        if(empty())return -1;
        int val=q.poll();
        return val;
    }
    
    public int top() {
        if(empty())return -1;
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()<1)return true;
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */