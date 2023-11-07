package piezas;

public class PiezaAjedrez {
    String nombre;
    String movimiento;

    // Constructor
    public PiezaAjedrez(String nombre, String movimiento) {
        this.nombre = nombre;
        this.movimiento = movimiento;
    }

    // Método para mostrar el nombre y movimiento de la pieza
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Movimiento: " + movimiento);
    }
}
