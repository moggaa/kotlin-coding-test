class Solution{
    fun longestPalindrome(s: String): String {
        fun expend(
            rangePair : Pair<Int,Int>
        ):String{
            var left = rangePair.first
            var right = rangePair.second
            while(left >= 0 && right < s.length && s[left]==s[right]){
                left -=1
                right +=1
            }
            return s.slice(left+1 until right)
        }
        if(s.length < 2 || s == s.reversed()){
            return s
        }
        var result = ""
        for(i in 0 until s.lastIndex){
            result = maxOf(result,
                expend(i to i+1),
                expend(i to i+2),
                comparator = compareBy{it.length}
            )
        }
        return result
    }
}
