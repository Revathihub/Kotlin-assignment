import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    println("Enter the Number: ")
    var num=scan.nextLine()
    var numint:Int=num.toInt()
    var originalNumber: Int=num.toInt()
    var remainder: Int
    var length=num.length
    var result = 0

    while (originalNumber != 0) {
        remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), length.toDouble()).toInt()
        originalNumber /= 10
    }

    if (result ==numint )
        println("$num is an Armstrong number.")
    else
        println("$num is not an Armstrong number.")

}