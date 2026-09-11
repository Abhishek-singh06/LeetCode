class Solution {
    public int numberOfMatches(int n) {
        int team=n;
        int matches=0;
        while(team!=1)
        {
            if(team%2==0)
            {
                team=team/2;
                matches+=team;
            }
            else
            {
                matches+=(team-1)/2;
                team=((team-1)/2) +1;
            }
        }
        return matches;
    }
}