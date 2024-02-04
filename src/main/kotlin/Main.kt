fun main() {
    val persona = Persona("Pepe", 30)
    val empleado = Empleado("Antonio", 43, 1500, 21)
    val gerente = Gerente("Jose", 28, 2000.0, 21.687, 500.0)

    println(persona)
    println(persona.celebrarCumple())

    println()

    println(empleado)
    println("Su salario es de: ${empleado.calcularSalario()}€")
    println(empleado.chamba())
    println(empleado.celebrarCumple())

    println()


    println(gerente)
    println("Su salario es de: ${gerente.calcularSalario()}€")
    println(gerente.administrar())
    println(gerente.celebrarCumple())
    println(gerente.chamba())

}