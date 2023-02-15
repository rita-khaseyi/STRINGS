fun main(){
    condition("RITA")
    greetings("rita",21)
    long("rita")
val school="Akirachix"
    println("${school[0]}${school[2]}${school[3]}")
}
fun greetings(name:String,age:Int): String {
    val statement= "Hi my name is $name I am $age years old"
    return statement
}

fun long(name: String):Int{
    var length =name.length
    return length
}
fun condition(name: String){
    if (name=="RITA"){
        println("Thats me")}
    else{
    println("I don't know who that is.")}

}