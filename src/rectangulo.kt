class rectangulo(var base: Double, var altura: Double){

    var perimetro:Double = 0.0
    var area : Double = 0.0
    fun calcularPerimetro(): Double {
        perimetro = ((2*this.base)+(2*this.altura))
        return perimetro
    }
    fun calcularArea(): Double {
        area = (this.base*this.altura)
        return area
    }


    override fun toString(): String {
        return "Rectángulo con area = ${this.area} cms y perimetro = ${this.perimetro} cms"
    }
}
