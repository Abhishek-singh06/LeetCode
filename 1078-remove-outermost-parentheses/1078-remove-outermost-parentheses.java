class Solution {
    class stack{
        public int top;
        public char[] arr;
        public int length;
         
         public stack(int l)
         {
            length=l;
            arr=new char[length];
            top=-1;
         }

         public void  push(char a)
         {
            if(top==length-1)
            {
                return ;
            }
            else
            {
                arr[++top]=a;
            }
         }
         public char pop()
         {
                if(top==-1)
                {
                    return '#';
                }
                else
                {
                    return arr[top--];

                }
         }
         public char peek()
         {
             if(top==-1)
                {
                    return '#';
                }
                else
                {
                    return arr[top];

                }
         }
         public boolean isEmpty() {
    return top == -1;
}
    }
    public String removeOuterParentheses(String s) {
        stack st=new stack(s.length());
        StringBuilder ans=new StringBuilder();
           for(int i=0;i<s.length();i++)
           {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                if(!st.isEmpty())
                {
                    ans.append(ch);
                }
                st.push(ch);
            }
            else
            {
                st.pop();
                 if(!st.isEmpty())
                {
                    ans.append(ch);
                }
            
            }
           }
           return ans.toString();
    }
}