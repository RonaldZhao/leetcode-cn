class MinStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.add(x);
        if (stack2.isEmpty() || stack2.peek() >= x)
            stack2.push(x);
    }

    public void pop() {
        if (stack2.peek().equals(stack1.pop()))
            stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
    
}