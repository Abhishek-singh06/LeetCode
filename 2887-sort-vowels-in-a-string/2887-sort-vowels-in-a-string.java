class Solution {
    public String sortVowels(String s) {
        char[] arr=s.toCharArray();
        char[] vow=new char[s.length()];
        int l=arr.length;
        int p=0;
        String vowel="aeiouAEIOU";
        for(int i=0;i<l;i++)
        {
              if(vowel.indexOf(arr[i])!=-1)
              {
                vow[p]=arr[i];
                p++;
              }
        }
        Arrays.sort(vow,0,p);
        int k=0;
        for(int i=0;i<l;i++)
        {
            if(vowel.indexOf(arr[i])!=-1)
            {
                arr[i]=vow[k];
                k++;
            }
        }
       
       
        return new String(arr);


    }
}