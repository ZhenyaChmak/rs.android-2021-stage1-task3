package subtask1

class Combinator {
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        if (m==n) return 1
        if (m==0) return null

        for (i in 1..n) {
            val w = factorial(n-i) * factorial(i)
            if(w <= 0) return null
            val q = factorial(n)/w
            if (m.toLong() == q) return i
        }
        return null
    }


    private fun factorial (f:Int):Long{
        if(f == 0)  return 0
        return if( f!=1 ) {
            f * factorial(f-1);
        } else 1
    }
}
