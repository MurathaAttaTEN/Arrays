import java.net.PortUnreachableException

fun main(){
      num()
    place()
    numberss()
    fam()




}
fun num(){
    var names = arrayOf("wambui", "prudence", "faith", "faith", "wanjiru")
    println(names.contentToString())


}
fun place(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { cities ->
        println(cities.capitalize())

    }
}
fun numberss(){
    var number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(number[2]+number[5])
    println(number.indexOf(158))
    var sortedNumber = number.sortedArray()
    println(sortedNumber.contentToString())
}



fun fam (){
    var peeps = arrayOf("mum", "dad", "child")
    println(peeps.contentToString())

    

}
