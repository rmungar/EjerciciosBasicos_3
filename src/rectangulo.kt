/**
 * La clase rectangulo cuenta con:
 * @property base Número que representa la base del rectángulo
 * @property altura Número que representa la altura del rectángulo
 */

class rectangulo(var base: Double, var altura: Double){

    var perimetro:Double = 0.0
    var area : Double = 0.0

    /**
     * calcularPermetro() se encarga de hacer calculos y devolver el perímetro del rectángulo
     * @return perimetro: Double que representa el perímetro
     */
    fun calcularPerimetro(): Double {
        perimetro = ((2*this.base)+(2*this.altura))
        return perimetro
    }
    /**
     * calcularArea() se encarga de hacer calculos y devolver el area del rectángulo
     * @return area: Double que representa el area
     */
    fun calcularArea(): Double {
        area = (this.base*this.altura)
        return area
    }


    override fun toString(): String {
        return "Rectángulo con area = ${this.area} cms y perimetro = ${this.perimetro} cms"
    }
}
