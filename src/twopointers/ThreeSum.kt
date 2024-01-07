package twopointers


object ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val resultList: MutableList<List<Int>> = mutableListOf()
        val sortedNums = nums.sortedArray()
        var start = 1
        var end = sortedNums.lastIndex

        for (index in sortedNums.indices) {
            while (start < end){
                val sum = sortedNums[index] + sortedNums[start] + sortedNums[end]
            if (sum < 0) {
                    start++
                } else if (sum > 0) {
                    end--
                } else {
                    val res = listOf(sortedNums[index], sortedNums[start++], sortedNums[end])
                    if (!resultList.contains(res)) resultList.add(res)
                }
            }
        }
        return resultList
    }
}