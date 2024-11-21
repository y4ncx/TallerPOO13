package Ejemplo3;

// Clase que implementa la interfaz
public class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}