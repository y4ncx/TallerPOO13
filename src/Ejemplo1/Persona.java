package Ejemplo1;

public class Persona implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Persona trabajando.");
    }
    @Override
    public void hablar() {
        System.out.println("Persona hablando.");
    }
}