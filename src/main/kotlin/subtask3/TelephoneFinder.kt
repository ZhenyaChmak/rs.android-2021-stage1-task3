package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number[0] == '-')
            return null

        var arr : Array<String> = emptyArray<String>()

            for (index in number.indices){
                val arrayComparison = comparison(number[index])

                for(i in arrayComparison.indices){
                    val result = number.replace(
                        number[index],
                        arrayComparison[i]
                    )
                    arr = arr +  arrayOf(result)
                }
            }
        return arr
    }

    private fun comparison (number: Char) : String{
       return when(number){
            '0' -> "8"
            '1' -> "24"
            '2' -> "135"
            '3' -> "26"
            '4' -> "157"
            '5' -> "2468"
            '6' -> "359"
            '7' -> "48"
            '8' -> "5790"
            '9' -> "68"
            else -> ""
       }
    }
}
