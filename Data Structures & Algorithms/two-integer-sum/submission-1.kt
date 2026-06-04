class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val inputMapping = HashMap<Int, Int>()

        for ((i, num) in nums.withIndex()) {
            val diff = target - num

            if (inputMapping.containsKey(diff)) {
                return intArrayOf(inputMapping[diff]!!, i)
            }
            inputMapping[num] = i
        }

        return intArrayOf()
    }
}
