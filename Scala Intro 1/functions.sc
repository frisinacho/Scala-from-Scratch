def greet(name: String): String = {
	return s"Hello ${name}"
}

val myName: String = "Nacho"

val greeting = greet(myName)
println(greeting)
