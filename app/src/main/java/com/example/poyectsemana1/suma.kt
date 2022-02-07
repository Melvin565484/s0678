package com.example.poyectsemana1



fun main(){
    val res1 = sumar(1,5)
    val res2 = sumar(-5,100)
    val res3 = sumar(null,null)
    val res4 = sumar(100,10000)
    val res5 = sumar(null, 100)
    val res6 = sumar(500, null)
    println("Test1 passed ${res1==6}")
    println("Test2 passed ${res2==-1}")
    println("Test3 passed ${res3==-2}")
    println("Test4 passed ${res4==10100}")
    println("Test5 passed ${res5==100}")
    println("Test6 passed ${res6==500}")
}

fun sumar(n1: Int?, n2: Int?):Int {
    var res = -1
    if (n1 != null && n2 != null){
        if (n1 >= 0 && n2 >= 0) {
            res = n1 + n2
        }
    }else{
        if(n1==null && n2==null){
            res=-2
        }else{
            res = if(n1!=null) n1 else n2!!
        }
    }
    return res
}

// n1=1, n2=5, res1=6
// n1=-5, n2=100, res2=-1
// n1=null, n2=null, res2=-2
// n1=100, n2=10000, res2=10100
// n1=null, n2=100, res2=100
// n1=500, n2=null, res2=500