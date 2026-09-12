class Solution {
    public int maxDepth(String s) {
        Stack aa=new Stack<>();
        int ans=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            ans++;
            else if(ch==')')
            ans--;
            if(max<ans)
            max=ans;
            aa.push(ch);
        }
        return max;
    }
}