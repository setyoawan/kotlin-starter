fun main() {

    // case 1
    /*val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }
    print("Office is open : $isOpen")*/

    // case 2
    /*val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed
    print("Office is open : $isOpen")*/

    // case 3 Disjunction atau OR (||)

    /*val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClose = now < officeOpen || now > officeClosed
    print("Office is closed : $isClose")*/

    // case 4 Negation atau NOT (!)
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}