fun main(){
    for(i in 1..5) {
        for (j in 4 downTo i )
            print("  ")
        for (k in 1..i)
            print("* ")
        println()
    }
}