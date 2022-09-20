class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val toMap = HashMap<Int,Int>()
        for ((index,value) in nums.withIndex()){
            toMap[value] = index
        }
        
        nums.forEachIndexed { index, value ->
            if(target - value in toMap && index != toMap[target-value]){
                return intArrayOf(index,toMap[target-value]!!)
            }
        }
        return intArrayOf(0,0)
    }
}