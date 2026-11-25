class MinStack {
    private int top = -1;
    private int size = 1000; // default size, adjust as needed
    private int[] arr = new int[size];

    public MinStack() {
    }

    public void push(int value) {
        if (top + 1 >= size) {
            return; // cannot push beyond stack size
        }
        arr[++top] = value;
    }

    public void pop() {
        if (top >= 0) {
            top--;
        }
    }

    public int top() {
        if (top >= 0) {
            return arr[top];
        }
        throw new IllegalStateException("Stack is empty");
    }

    public int getMin() {
        if (top < 0) {
            throw new IllegalStateException("Stack is empty");
        }
        int min = arr[0];
        for (int i = 1; i <= top; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 **/