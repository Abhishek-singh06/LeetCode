class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        int c=0;
        for(int i=0;i<sentences.length;i++)
        {
            for(int j=0;j<sentences[i].length();j++)
            {
                if(sentences[i].charAt(j)==' ')
                c++;
            }
            if(ans<c+1)
            ans=c+1;
            c=0;
        }
        return ans;
        
    }
}