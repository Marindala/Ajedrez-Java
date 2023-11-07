import piezas.*;

public class Main {
    public static void main(String[] args) {
        // Instanciamos las piezas
        PiezaAjedrez rey = new Rey();
        PiezaAjedrez reina = new Reina();
        PiezaAjedrez torre = new Torre();
        PiezaAjedrez caballo = new Caballo();
        PiezaAjedrez alfil = new Alfil();
        PiezaAjedrez peon = new Peon();

        // Mostramos los movimientos de cada pieza
        rey.mostrarInformacion();
        System.out.println();
        reina.mostrarInformacion();
        System.out.println();
        torre.mostrarInformacion();
        System.out.println();
        caballo.mostrarInformacion();
        System.out.println();
        alfil.mostrarInformacion();
        System.out.println();
        peon.mostrarInformacion();
    }
}