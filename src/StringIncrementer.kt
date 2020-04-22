fun incrementString(str: String) : String {
    val x = str.takeLastWhile { it.isDigit() }
    return str.dropLast(x.length) + ((x.toIntOrNull() ?: 0) + 1).toString().padStart(x.length,'0')
}


//Your job is to write a function which increments a string, to create a new string.
//
//If the string already ends with a number, the number should be incremented by 1.
//If the string does not end with a number. the number 1 should be appended to the new string.
//Examples:
//
//foo -> foo1
//
//foobar23 -> foobar24
//
//foo0042 -> foo0043
//
//foo9 -> foo10
//
//foo099 -> foo100