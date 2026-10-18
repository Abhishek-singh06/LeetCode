class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums)
        {
            pq.add(num);

        }
        int ans=(pq.poll()-1)*(pq.poll()-1);
        return ans;
        
        }
}