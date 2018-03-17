fun main(args: Array<String>) {
    val d = readLine()!!.split(" ").map(String::toInt)
    val p = d[0].toDouble() / 100.0
    val n = d[1]
    
    
    var sum: Double = 0.0
    for (x in 0..2) {
        sum += b(x, n, p)
    }
    println("%.3f".format(sum))
    
    sum = 0.0
    for (x in 2..n) {
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