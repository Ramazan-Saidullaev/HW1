import kotlin.math.pow

//Task1
//fun Int.toPower(exponent: Int): Int {
//    return this.toDouble().pow(exponent).toInt()
//}
//
//fun main() {
//    val result = 2.toPower(3)
//    println(result)
//}

//Task 2
//fun Int.toPowerWithLambda(exponent: Int, resultLambda: (Int) -> Unit) {
//    val result = this.toDouble().pow(exponent).toInt()
//    resultLambda(result)
//}
//
//fun main() {
//    2.toPowerWithLambda(3) { result ->
//        println(result)
//    }
//}

//Task 3
//inline fun <reified T> T.displayTypeInfo() {
//    when (T::class) {
//        Int::class -> println("это Int")
//        String::class -> println("это String")
//        else -> println("тип у $this неизвестен")
//    }
//}
//
//fun main() {
//    3.displayTypeInfo()
//    "a".displayTypeInfo()
//    true.displayTypeInfo()
//}

//Task 4
//sealed class DataType {
//    data class DoubleType(val value: Double) : DataType()
//    object UnitType : DataType()
//}
//
//fun DataType.displayTypeInfo() {
//    when (this) {
//        is DataType.DoubleType -> println("это DoubleType ${this.value}")
//        is DataType.UnitType -> println("это Unit")
//    }
//}
//fun main(args: Array<String>) {
//    DataType.DoubleType(1.4).displayTypeInfo()
//    DataType.UnitType.displayTypeInfo()
//
//}

