fun main(){
    var a=10
    var b=20
    println("A.With use of temporary variable:")
    println("...Before swapping values...")
    println("a=$a b=$b")
    val temp=a
    a=b
    b=temp
    println("...After swapping values...")
    println("a=$a b=$b")
    var c=30
    var d=40
    println("B.Without use of temporary variable:")
    println("...Before swapping values...")
    println("c=$c d=$d")
    c=c+d
    d=c-d
    c=c-d
    println("...After swapping values...")
    println("c=$c d=$d")

}