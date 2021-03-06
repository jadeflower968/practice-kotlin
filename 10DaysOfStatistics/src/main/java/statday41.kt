fun main(args: Array<String>) {
    val pp = readLine()!!.split(" ").map(String::toDouble)
    val p = pp[0] / (pp[0] + pp[1])
    val n = 6
    
    var sum: Double = 0.0
    for (x in 3..6) {
        sum += b(x, n, p)
    }
    
    println("%.3f".format(sum))
}

private fun factorial(N: Int): Int {
    if (N <= 1) {
        return 1
    } else {
        return N * factorial(N-1)
    }
}

private fun b(x: Int, n: Int, p: Double): Double {
    val factor1 = factorial(n) / (factorial(x) * factorial(n - x))
    val factor2 = Math.pow(p.toDouble(), x.toDouble())
    val factor3 = Math.pow((1-p).toDouble(), (n-x).toDouble())
    return factor1 * factor2 * factor3
}