import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    println("Enter the Year: ")
    var year=scan.nextInt()
    if((year%4==0 && year%100!=0) || (year%400==0)){
        print("$year is a LeapYear")
    }
    else{
        print("$year is Not a LeapYear")
    }
}