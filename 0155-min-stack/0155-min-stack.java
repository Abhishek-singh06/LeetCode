class MinStack {
    public int[] stack;
    public int topa;
    public int l;
    public int[] min;
    public int ans;

    public MinStack() {
        stack = new int[30000];
        min = new int[30000];
        l = stack.length;
        topa = -1;
        ans = 0;

    }

    public void push(int value) {
        if (topa == l - 1)
            return;

        stack[++topa] = value;

        if (topa == 0) {
            min[topa] = value;
        } else {
            min[topa] = Math.min(value, min[topa - 1]);
        }
    }

    

    public void pop() {
        if (topa == -1)
            return;
        topa--;

    }

    public int top() {
        if (topa == -1)
            return -1;
        return stack[topa];
    }

    public int getMin() {
        if (topa == -1)
            return -1;

        return min[topa];

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */