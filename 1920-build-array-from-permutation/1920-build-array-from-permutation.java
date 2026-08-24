class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        // Store both original value and new value
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }

        // Extract the new values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}