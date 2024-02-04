/**
 * Clase derivada de la clase empleado
 * @param nombre :String el nombre del gerente
 * @param edad :Int edad del gerente
 * @param salarioBase :Double salario base del gerente
 * @param porImpuestos :Double porcentaje de Impuestos que se le va a aplicar
 * @param bonus :Double bonus que se le va a añadir a su salario final
 * @param excentoImpuestos :Boolean indica si está excento de impuestos o no
 */
class Gerente(nombre:String, edad:Int, salarioBase:Double, porImpuestos:Double = 33.99, var bonus:Double, var excentoImpuestos: Boolean = false) :Empleado(nombre, edad, salarioBase, porImpuestos) {

    /**
     * Calcula el salario del gerente y le añade el bonus, si está excento de impuestos no se le aplicarán estos
     * y si no lo está si se le aplica al salario base.
     * @return Double retorna el calculo del salario aplicado.
     */
    override fun calcularSalario() :Double {
        if (!excentoImpuestos) {
            return super.calcularSalario() + bonus
        }
        else {
            return salarioBase + bonus
        }
    }

    /**
     * Imprime por pantallala información del gerente.
     * @return String con la información del gerente.
     */
    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus€"
    }

    /**
     * Imprime por pantalla la acción del gerente.
     * @return String con la acción del gerente.
     */
    fun administrar():String {
        return "$nombre está administrando la empresa."
    }
}