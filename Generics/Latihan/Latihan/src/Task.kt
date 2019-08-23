// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    print(cetakData(stringResult, intResult))
}

// TODO 1
fun <T> getResult(args: T): Int {
    if(args is String){
        return args.length
    }
    else if(args is Int){
        return args * 5
    }
    else{
        return 0
    }
}
fun cetakData(hero: Int, hero1: Int): String {
    return "$hero$hero1"

}