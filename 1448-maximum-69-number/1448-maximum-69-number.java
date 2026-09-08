class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        int l=sb.length();
        for(int i=0;i<l;i++)
        {
            if(sb.charAt(i)=='9')
            continue;
            else
            {
                sb.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}