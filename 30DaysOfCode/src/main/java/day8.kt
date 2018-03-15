import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    reader.nextLine()
    val map = mutableMapOf<String, String>()
    var a: List<String>
    for (i in 0..(n-1)) {
        a = reader.nextLine().split(" ")
        map[a[0]] = a[1]
    }
    var b: String = reader.nextLine()
    while (b != "") {
        if (map.containsKey(b)) {
            println("$b=${map[b]}")
        } else {
            println("Not found")
        }
        b = reader.nextLine()
    }
    reader.close()
}