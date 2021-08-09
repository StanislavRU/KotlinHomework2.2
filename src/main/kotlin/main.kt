fun main() {
    val likes = 15121

    if (likes%10 == 1 && likes%100 != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}