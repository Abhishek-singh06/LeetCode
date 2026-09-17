class Solution {
    public boolean isSameAfterReversals(int num) {

        String sa = String.valueOf(num);
        int o1 = sa.length();

        String rev = "";
        int o = 0;

        // First reversal
        for (int i = o1 - 1; i >= 0; i--) {
            rev += sa.charAt(i);
        }

        // Remove leading zeros
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) != '0') {
                o = i;       // FIX
                break;
            }
        }

        String s = rev.substring(o, rev.length());

        int l = s.length();
        String ans1 = "";
        String ans2 = "";

        // Second reversal
        for (int i = l - 1; i >= 0; i--) {
            ans1 += s.charAt(i);
        }

        

        int p = Integer.parseInt(ans1);

        if (p == num)
            return true;

        return false;
    }
}