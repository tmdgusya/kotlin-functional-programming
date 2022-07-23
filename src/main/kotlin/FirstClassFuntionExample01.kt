// Function can be argument that is other function
fun doSomething(func: (Int) -> String, number: Int): String {
    return func.invoke(number)
}

// Function can be place where return value which other function
fun doReturnFunction(): (Int) -> String {
    return { value: Int -> value.toString() }
}

// Function can be put to list
val funcList: List<(Int) -> String> = listOf({ value: Int -> "$value" }, { value: Int -> "$value index 2" })
