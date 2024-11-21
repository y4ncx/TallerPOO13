package Ejemplo1;

// Definición de una interfaz
public interface Trabajador {
    void trabajar(); // Método abstracto
    default void tomarDescanso() {
        System.out.println("Tomando un descanso.");
    }
}