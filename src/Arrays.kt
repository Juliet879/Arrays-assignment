import java.util.*

fun main() {
    continents("Africa","Asia","Europe","North America")
    capitals()

}
fun continents(cont1:String,cont2:String,cont3:String,cont4:String) {
    var myArrays = arrayOf(cont1,cont2,cont3,cont4)
     println(Arrays.toString(myArrays))
}

fun capitals() {
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")

    cities.forEach { city->
        println(city.capitalize())
    }
}

