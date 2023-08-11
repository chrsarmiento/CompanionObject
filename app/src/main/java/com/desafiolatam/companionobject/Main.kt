package com.desafiolatam.companionobject

fun main(){

    var emp01 = Empleado("Elba Lazo",20000,true)
    println(emp01.situacionEmpleado())

    val sueldo = Empleado.calcularSueldo(200.0,emp01.valorHora)
    println("El sueldo de ${Empleado.nombreMayusculas(emp01.nombre)} es $sueldo")
}