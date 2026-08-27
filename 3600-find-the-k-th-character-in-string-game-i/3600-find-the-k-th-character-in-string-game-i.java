class Solution {
    public char kthCharacter(int k) {
        String word="a";
        String words=ans(word,k);
        char ch=words.charAt(k-1);
        return ch;
    }
    public String ans(String word, int k)
    {
        if(word.length()>=k)
        return word;
        String temp=word;;
        for(int i=0;i<word.length();i++)
        {
            temp+=(char)(word.charAt(i)+1);
        }
        word=temp;
        return ans(word,k);
    }
}