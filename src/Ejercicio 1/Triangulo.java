class Triangulo extends Figura {

    double largo;
    double ancho;
    
    public Triangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }


    @Override
    public double calcularArea() {
        return (largo * ancho)/2;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

}