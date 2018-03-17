import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val s = Integer.toBinaryString(n)
    var maxConsecutive = 0
    var count = 0
    for (i in s.indices) {
        if (s[i] == '1') {
            count += 1
            if (count > maxConsecutive) {
                maxConsecutive = count
            }
        } else {
            count = 0
        }
    }
    println(maxConsecutive)
    reader.close()
}
