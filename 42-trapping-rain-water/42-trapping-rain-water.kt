import java.lang.Integer.max

class Solution {
    fun trap(height: IntArray): Int {
        if(height.size <= 1){
            return  0
        }
        var volume = 0
        var (left,right) = Pair(0,height.lastIndex)
        var (leftMax,rightMax) = Pair(height[0],height[height.lastIndex])
        while(left < right){
            leftMax = max(leftMax,height[left])
            rightMax = max(rightMax,height[right])
            if(leftMax <= rightMax){
                volume += leftMax - height[left]
                left++
            }
            else{
                volume += rightMax - height[right]
                right--
            }
        }
        return volume
    }
}