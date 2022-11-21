import java.util.Scanner

fun main(){
    println("Enter the Factorial Number:")
    var scan=Scanner(System.`in`)
    val num=scan.nextInt()
    var factorial=1
    for(i in 1..num){
        factorial *= i
    }
    println("Factorial of $num is $factorial")
}