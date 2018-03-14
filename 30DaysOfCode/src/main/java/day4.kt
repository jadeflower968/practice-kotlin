import java.util.Scanner

class Person(initialAge: Int) {
    var age: Int
	init {
        if (initialAge < 0) {
            println("Age is not valid, setting age to 0.")
            age = 0
        } else {
            age = initialAge
        }
	}

	fun amIOld() {
        if (age < 13) {
	        println("You are young.")
        } else if (age < 18) {
            println("You are a teenager.")
	    } else {
	        println("You are old.")
	    }
	}

	fun yearPasses() {
  	    age++
	}
}

fun main(args: Array<String>) {
    val a = Person(4)
    a.amIOld()
    a.yearPasses()
    a.amIOld()
    
    val b = Person(-1)
    b.amIOld()
    b.yearPasses()
    b.amIOld()
    
    val c = Person(18)
    c.amIOld()
    c.yearPasses()
    c.amIOld()
}