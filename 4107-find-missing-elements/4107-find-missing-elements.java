class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        int low = nums[0];
        int high = nums[nums.length - 1];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        for (int i = low; i <= high; i++) {
            if (!map.containsKey(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}