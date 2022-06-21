fun main() {
    // case  1
    /*val intArray = intArrayOf(1, 3, 5, 7)
    print(intArray[2])*/

    // case 2
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])
}