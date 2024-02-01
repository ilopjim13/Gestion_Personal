class Gerente(nombre:String, edad:Int, salarioBase, porImpuestos:Double, var bonus:Double, var excentoImpuestos: Boolean = false) :Empleado(nombre, edad, salalrioBase, porImpuestos) {

    override fun calcularSalario() :Double {
        if (excentoImpuestos) {

        }
    }
}