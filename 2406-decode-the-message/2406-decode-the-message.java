class Solution {
    public String decodeMessage(String key, String message) {
        char ch='a';
       
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<key.length();i++)
        {    
            if(map.get(key.charAt(i))==null)
            {
                if(key.charAt(i)==' ')
                map.put(' ',' ');
                else

            map.put(key.charAt(i),ch++);
            }
        }
       StringBuilder ans = new StringBuilder();

for (int i = 0; i < message.length(); i++) {
    char p = message.charAt(i);

    if (p == ' ')
        ans.append(' ');
    else
        ans.append(map.get(p));
}

return ans.toString();
    }
}