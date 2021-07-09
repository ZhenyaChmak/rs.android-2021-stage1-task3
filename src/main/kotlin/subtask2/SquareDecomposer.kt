package subtask2

import kotlin.math.sqrt


class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        return if (number <= 4) null
                else decompose(number * number, number - 1)
    }

    private fun decompose(numberSquare: Int, number: Int): Array<Int>? {
        for (i in number downTo 1) {
            val remainder = numberSquare - i * i
            if (remainder == 0)
                return arrayOf(i)

            var nextRemaider = sqrt(remainder.toDouble()).toInt()
            if (nextRemaider >= i)
                nextRemaider = i - 1

            val arr = decompose(remainder, nextRemaider)
            if (arr != null)
                return arr.plus(i)
        }
        return null
    }
}