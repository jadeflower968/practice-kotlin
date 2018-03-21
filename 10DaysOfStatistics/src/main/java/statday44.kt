fun main(args: Array<String>) {
    val pp = readLine()!!.split(" ").map(String::toDouble)
    val i = readLine()!!.toInt()
    
    val p = pp[0] / pp[1]
    
    println("%.3f".format(g(i, p)))
}

private fun g(n: Int, p: Double): Double {
    val factor1 = Math.pow((1-p).toDouble(), (n-1).toDouble())
    return factor1 * p
}