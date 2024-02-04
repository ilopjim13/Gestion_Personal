/**
 * Clase derivada de la clase Persona y clase padre de la clase Gerente
 * @param nombre :String el nombre del gerente
 * @param edad :Int edad del gerente
 * @param salarioBase :Double salario base del gerente
 * @param porImpuestos :Double porcentaje de Impuestos que se le va a aplicar
 */
open class Empleado(nombre:String, edad:Int, val salarioBase: Double, val porImpuestos: Double = 10.0) :Persona(nombre, edad) {

    /**
     * Constructor secundario para poder poner el salario base y los impuestos como Int
     * @param nombre :String el nombre del gerente
     * @param edad :Int edad del gerente
     * @param salarioBase :Int salario base del gerente
     * @param porImpuestos :Int porcentaje de Impuestos que se le va a aplicar
     */
    constructor(nombre:String, edad:Int, salarioBase: Int, porImpuestos: Int = 10) : this(nombre, edad, salarioBase.toDouble(), porImpuestos.toDouble())

    /**
     * Calcula el salario del empleado aplicandole los impuestos al salario base.
     * @return Double retorna el calculo del salario aplicado.
     */
    open fun calcularSalario():Double {
        return salarioBase - (salarioBase * (porImpuestos / 100))
    }
    /**
     * Imprime por pantalla la acción del empleado.
     * @return String con la acción del empleado.
     */
    fun chamba():String {
        return "$nombre está trabajando en la empresa"
    }

    /**
     * Imprime por pantallala información del empleado.
     * @return String con la información del empleado.
     */
    override fun toString(): String {
        return "${super.toString()}, Salario Base: $salarioBase€"
    }

}