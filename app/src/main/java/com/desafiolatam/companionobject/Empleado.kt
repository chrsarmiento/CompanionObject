package com.desafiolatam.companionobject

import android.renderscript.ScriptIntrinsicYuvToRGB
import com.desafiolatam.companionobject.constant.SUELDO_BASE

class Empleado(var nombre: String, var valorHora:Int,var activo:Boolean) {

    companion object {
        @JvmStatic
        fun calcularSueldo(horas:Double, valorHora:Int):Double = SUELDO_BASE + horas * valorHora

        fun nombreMayusculas(nombre: String): String = nombre.uppercase()

    }

    fun situacionEmpleado(): String{
        return if(activo){
            return "Contratado"
        }
        else{
            return "Despedido"
        }
    }
}