fun main() {
    // case 1 Safe calls operator (?.)
    /*val text: String? = null
    text?.length*/

    // case 2 Elvis Operator (?:)
    val text: String? = null
    val textLength = text?.length ?: 7
}