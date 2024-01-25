fun main(){
    val rectangulo1 = rectangulo(12.0, 12.0)
    val rectangulo2 = rectangulo(19.0, 20.0)
    val rectangulo3 = rectangulo(9.0, 1.0)
    val rectangulo4 = rectangulo(7.0, 15.0)
    rectangulo1.calcularArea()
    rectangulo1.calcularPerimetro()
    rectangulo2.calcularArea()
    rectangulo2.calcularPerimetro()
    rectangulo3.calcularArea()
    rectangulo3.calcularPerimetro()
    rectangulo4.calcularArea()
    rectangulo4.calcularPerimetro()
    println(rectangulo1.toString())
    println(rectangulo2.toString())
    println(rectangulo3.toString())
    println(rectangulo4.toString())

}