import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    
    for (i in 1..10) {
        println("${n} x ${i} = ${n*i}")
    }
    
    reader.close()
}