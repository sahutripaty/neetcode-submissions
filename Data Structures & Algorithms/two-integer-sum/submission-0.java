class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> inputArrayMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (inputArrayMap.containsKey(diff)) {
                return new int[] {inputArrayMap.get(diff), i};
            }

            inputArrayMap.put(num, i);
        }

        return new int[] {};
    }
}
