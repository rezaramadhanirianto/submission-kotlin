fun main() {
    val valueA = 65
    val valueB = 52
    var valueC = 78

    if(valueC == null){
        valueC = 100
    }

    var result = calculate(valueA, valueB, valueC)

    // TODO 3
    println(result)
}

fun calculate(valueA: Int, valueB: Int,valueC: Int): String {
    val result =  valueA + (valueB - valueC)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = "Result is $result"