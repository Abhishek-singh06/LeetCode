class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int l1=players.length;
        int l2=trainers.length;
        int left=0;
        int right=0;
        int c=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
      
        while(left<l1 && right<l2)
        {
            if(players[left]<=trainers[right])
            {
                c++;
                left++;
                right++;
            }
            else
            {
                 right++;
            }
        }
        
        return c;

    }
}