fun main() {
    val likes = 10221
    var i = 1
    var j = 11
    var value = true

    while (likes >= i) {
        if (i === likes) {
            value = false
        }
        if (j === likes) {
            value = true
            break
        }
        i += 10
        j += 100
    }
    if (value) {
        println("Понравилось $likes людям")
    } else {
        println("Понравилось $likes человеку")
    }
}