class Solution{
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        if(matrix.isEmpty()){
            return emptyList();
        }
        val answerList = mutableListOf<Int>()

        var (rowStart, rowEnd) = Pair(0,matrix.lastIndex)
        var (colStart, colEnd) = Pair(0,matrix[0].lastIndex)

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(i in colStart..colEnd){
                answerList.add(matrix[rowStart][i])
            }
            rowStart++

            for(i in rowStart..rowEnd){
                answerList.add(matrix[i][colEnd])
            }
            colEnd--
            
            if(rowStart > rowEnd || colStart > colEnd){
                break
            }

            for(i in colEnd downTo colStart){
                answerList.add(matrix[rowEnd][i])
            }
            rowEnd--

            for(i in rowEnd downTo rowStart){
                answerList.add(matrix[i][colStart])
            }
            colStart++
        }


        return answerList

    }
}