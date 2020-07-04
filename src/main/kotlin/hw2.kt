fun main() {
    val index = bodyMassIndex()
    val verdict = when (index) {
        in 0..16 -> "Выраженный дефицит массы тела"
        in 16..18 -> "Недостаточная (дефицит) масса тела"
        in 19..25 -> "Норма"
        in 25..30 -> "Избыточная масса тела (предожирение)"
        in 30..35 -> "Ожирение"
        in 35..40 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)
}

fun bodyMassIndex(): Int {
    println("Введите рост в см.")
    val growth = readLine()!!.toDouble()
    println("Введите вес в кг.")
    val weight = readLine()!!.toInt()

    return (weight / ((growth / 100) * (growth / 100))).toInt()
}