open class Empleado(nombre:String, edad:Int, var salarioBase: Double, var porImpuestos: Double = 10.0) :Persona(nombre, edad) {

    open fun calcularSalario():Double {
        return salarioBase * (porImpuestos / 100)
    }

    fun chamba():String {
        return "$nombre está trabajando en la empresa"
    }

    override fun toString(): String {
        return "${super.toString()}, Salario Base: $salarioBase€"
    }

}