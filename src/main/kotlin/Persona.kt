/**
 * Clase Persona padre de la que derivan las demás
 * @property nombre :String el nombre de la persona
 * @property edad :Int edad de la persona
 */
open class Persona(val nombre:String, var edad:Int) {

    /**
     * Le añade un año más a su edad e imprime por pantalla un texto felicitándolo.
     * @return String texto felicitando a la persona
     */
    fun celebrarCumple() : String {
        this.edad++
        return "Feliz cumpleaños $nombre! Ahora tienes $edad años."
    }

    /**
     * Imprime por pantallala información de la persona.
     * @return String con la información dela persona.
     */
    override fun toString() = "Nombre: $nombre, Edad: $edad"
}