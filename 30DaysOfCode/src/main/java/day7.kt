import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    reader.nextInt()
    reader.nextLine()
    var A_: List<String> = reader.nextLine().split(' ')
    val A = A_.reversed()
    
    var str = ""
    A.forEach { i ->
        str += i + " "
    }
    println(str.trim())
    reader.close()
}