class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int l=words.size();
        String ans="";
        for(int i=0;i<l;i++)
        {
            ans+=words.get(i).charAt(0);
        }
        if(ans.equals(s))
        return true;
        return false;
    }
}