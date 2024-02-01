open class Persona(val nombre:String, var edad:Int) {

    fun celebrarCumple() : String {
        this.edad++
        return "Feliz cumpleaños $nombre! Ahora tienes $edad años."
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
}