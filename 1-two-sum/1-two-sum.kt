class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val toMap = nums.mapIndexed { index, value ->
            value to index
        }.toMap()

        nums.forEachIndexed { index, value ->
            if(target - value in toMap && index != toMap[target-value]){
                return intArrayOf(index,toMap[target-value]!!)
            }
        }
        return intArrayOf(0,0)
    }
}