class Solution {
    class stack {
        public char[] arr;
        public int top;
        public int capacity;

        public stack(int c) {
            capacity = c;
            arr = new char[capacity];
            top = -1;
        }

        public void push(char ch) {
            if (top == capacity - 1)
                return;

            arr[++top] = ch;
        }

        public char pop() {
            if (top == -1)
                return '#';

            return arr[top--];
        }

        public char peek() {
            if (top == -1)
                return '#';

            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public boolean isValid(String s) {
        stack st = new stack(s.length());
        char[] arr = s.toCharArray();
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                st.push(arr[i]);
            } 
            else {
                if (st.isEmpty()) {
                    return false;
                }
                if (arr[i] == ')' && st.peek() != '(') {
                    return false;
                }
                if (arr[i] == '}' && st.peek() != '{') {
                    return false;
                } 
                if (arr[i] == ']' && st.peek() != '[') {
                    return false;
            }
            st.pop();
        }
        }
        return st.isEmpty();

    }
}