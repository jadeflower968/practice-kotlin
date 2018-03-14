import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    reader.nextLine()
    var a = arrayListOf<String>()
    for (i in 0..(n-1)) {
        a.add(reader.nextLine())
    }
    var oddStr = ""
    for (s in a) {
        for (i in s.indices) {
            if(i % 2 == 0){
                print(s[i])
            }else{
                oddStr += s[i]
            }
        }
        print(" ")
        println(oddStr)
        oddStr = ""
    }
    reader.close()
}