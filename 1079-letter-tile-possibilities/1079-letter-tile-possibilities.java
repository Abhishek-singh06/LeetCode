class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq=new int[26];
        for(char ch:tiles.toCharArray())
        {
            freq[ch-'A']++;
        }
     int  ans= backtrack(freq);
        return ans;
    }
    int backtrack(int[] freq)
    {
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
            continue;

            freq[i]--;
            count++;
            count+=backtrack(freq);
            freq[i]++;
        }
        return count;
    }
}