class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hasDuplicate = HashSet<Int>()

        for (num in nums) {
            if (num in hasDuplicate) {
                return true
            }
            hasDuplicate.add(num)
        }
        return false
    }
}
