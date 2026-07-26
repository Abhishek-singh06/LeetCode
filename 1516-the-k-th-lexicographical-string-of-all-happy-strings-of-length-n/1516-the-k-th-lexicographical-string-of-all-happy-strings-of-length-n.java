class Solution {
    List<String> list=new ArrayList<>();
    public String getHappyString(int n, int k) {
        
        
        
        backtrack(n,new StringBuilder());
        if(k>list.size())
        {
            return "";
        }
        return list.get(k-1);
    }
        void backtrack(int n,StringBuilder curr)
        {
            if(curr.length()==n)
            {
                list.add(curr.toString());
                return;
            }
            for(char ch: new char[]{'a','b','c'})
            {
            if(curr.length()>0 && curr.charAt(curr.length()-1)==ch)
            {
                  continue;
            }
            curr.append(ch);
            backtrack(n,curr);
            curr.deleteCharAt(curr.length()-1);
            }
        }
    }
