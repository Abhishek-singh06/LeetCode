class Solution {
    public List<String> validStrings(int n) {
        List<String> l=new ArrayList<>();
        generate("",n,l);
        return l;
    }
    void generate(String s,int n,List<String> l)
    {
        if(s.length()==n)
        {
        l.add(s);
        return;
        }
        generate(s+"1",n,l);
        if( s.isEmpty() || s.charAt(s.length()-1)=='1' )
        generate(s+"0",n,l);
    }
}