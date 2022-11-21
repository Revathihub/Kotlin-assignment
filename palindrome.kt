import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    println("Enter the Number: ")
    var num=scan.nextInt()
    var reversenum = 0
    var remainder: Int
    val originalInteger: Int = num


    while (num != 0) {
        remainder = num % 10
        reversenum = reversenum * 10 + remainder
        num /= 10
    }

    if (originalInteger == reversenum)
        println("$originalInteger is a palindrome.")
    else
        println("$originalInteger is not a palindrome.")

}