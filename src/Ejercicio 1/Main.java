public class Main {
    
    public static void main(String[] args) {

        Figura rectangulo = new Rectangulo(33, 12);

        Figura triangulo = new Triangulo(33, 12);
        

        System.out.println("El area del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El area del triangulo es: " + triangulo.calcularArea());
    }

}