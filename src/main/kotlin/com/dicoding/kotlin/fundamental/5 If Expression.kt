fun main() {

    // case 1
    /*val openHours = 7
    val now = 20
    if (now > openHours){
        println("office already open")
    }*/

    // case 2
    /*val openHours = 7
    val now = 20
    val office: String
    if (now < openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    print(office)*/

    // case 3
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}
