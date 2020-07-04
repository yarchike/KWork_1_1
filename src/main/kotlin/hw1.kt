fun main() {
    println("Введите стоимость текущей продажи")
    val amount = readLine()!!.toInt() // стоимость текущей продажи
    println("Введите сумму предыдущих продаж")
    val total = readLine()!!.toInt() // сумма предыдущих продаж
    println("Вы являетесь эксклюзивным автором?")
    val exclusive = readLine() == "да"
    val fee = calculateFee(amount, total, exclusive)  // exclusive по умолчанию = false
    println(fee) //
}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean = false): Int {
    val tax = when (total) {
        in 0..1_000 -> 0.3
        in 1_001..10_000 -> 0.25
        in 10_001..50_000 -> 0.2
        else -> 0.15
    }
    val result = if (exclusive) {
        tax - 0.05
    } else {
        tax
    }
    return (amount * result).toInt()
}

