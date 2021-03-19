import java.util.*

fun main() {
    continents("Africa","Asia","Europe","North America")
    capitals()
    complex()

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

fun complex() {
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)

    var add = numbers[1].plus(numbers[5])
    println(add)
    println(numbers.indexOf(158))
    println(Arrays.toString(numbers.sortedArray()))
}