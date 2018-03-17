import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    println(factorial(n))
    reader.close()
}

private fun factorial(N: Int): Int {
    if (N <= 1) {
        return 1
    } else {
        return N * factorial(N-1)
    }
}