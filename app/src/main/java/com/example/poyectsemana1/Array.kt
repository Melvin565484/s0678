package com.example.poyectsemana1


fun main(){


var fil=JOptionPane.showInputDialog("Escribir numero").toInt()
var col=Println("Escribir el mismo numero de nuevo").toInt()
var matriz=Array(fil){IntArray(col)}
var esSimetrica=true
for (i in 0 until fil){
    for (j in 0 until fil){
        matriz[i][j]=JOptionPane.showInputDialog("Matriz[${i+1}][${j+1}]").toInt()
    }
}
var sumaFil=0
for (i in 0 until fil){
    sumaFil=0
    for (j in 0 until fil){
        sumaFil=sumaFil+matriz[i][j]
    }
    println("La suma de la fila ${i+1}=$sumaFil")
}
var sumaCol=0
for(j in 0 until col){
    sumaCol=0
    for(i in 0 until fil){
        sumaCol=sumaCol+matriz[i][j]
    }
    println("La suma de la columna ${j+1}=$sumaCol")
}