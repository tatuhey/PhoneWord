fun main(args: Array<String>) {

    print("Enter phone number: ")
    var inputWord : String = readln().lowercase()

    fun String.replaceChars(replacement: Map<Char, Char>) = map { replacement.getOrDefault(it, it) }.joinToString("")
    val map = mapOf(
        'a' to '2', 'b' to '2', 'c' to '2', 'd' to '3', 'e' to '3', 'f' to '3',
        'g' to '4', 'h' to '4', 'i' to '4', 'j' to '5', 'k' to '5', 'l' to '5',
        'm' to '6', 'n' to '6', 'o' to '6', 'p' to '7', 'q' to '7', 'r' to '7', 's' to '7',
        't' to '8', 'u' to '8', 'v' to '8', 'w' to '9', 'x' to '9', 'y' to '9', 'z' to '9')

    val outputWord = inputWord.replaceChars(map)

    println(outputWord)

}