package com.example.poyectsemana1


fun main(){
    var caso1: Array<Int> = arrayOf(1, 2, 5, 9)
    var caso2: Array<Int> = arrayOf(1, 2, 5, 9)
    var caso3: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var res1 = searchData(caso1, 1) //0
    var res2 = searchData(caso2, 9) //3
    var res3 = searchData(caso3, 100) //6
    println("searchData(caso1, n=1) Test passed ${res1==0}")
    println("searchData(caso2, n=9) Test passed ${res2==3}")
    println("searchData(caso3, n=100) Test passed ${res3==6}")
}
fun searchData(colleccion:Array<Int>, number: Int):Int{
    colleccion.forEachIndexed({p, i -> if(i==number) return p})
    return -1
}

