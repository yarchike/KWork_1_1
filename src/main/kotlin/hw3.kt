fun main() {
    val publishedAgo = 18000
    val toMin = if (publishedAgo > 3599) {
        publishedAgo / 3600
    } else {
        publishedAgo / 60
    }
    val result = when (publishedAgo) {
        in 0..59 -> "менее минуты назад"
        in 60..179 -> "минуту назад"
        in 180..299 -> "$toMin минуты назад"
        in 300..3599 -> "$toMin минут назад"
        in 3600..17999 -> "$toMin часа назад"
        else -> "$toMin часов назад "
    }
    println(result)
}
