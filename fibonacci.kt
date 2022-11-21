import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    println("Enter the Fibonacci series length: ")
    var num=scan.nextInt()
    var a=0
    var b=1
    if(num==1){
        println("fibonacci series for $num is $a")
    }
    else{
        for (i in 1..num ){
            var temp=a+b
            print("$a ")
            a=b
            b=temp
        }
    }
}