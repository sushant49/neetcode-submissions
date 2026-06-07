class MinStack {
     int[] arr;
     int top;
     int[] minStack;
    public MinStack() {
        arr = new int[1000];
        minStack = new int[1000];
        top=-1;
    }
    
    public void push(int val) {
        top++;
        arr[top] = val;
        if(top == 0) {
            minStack[top] = val;
        } else {
            minStack[top] = Math.min(val, minStack[top-1]);
        }
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
        return minStack[top];
    }
}
