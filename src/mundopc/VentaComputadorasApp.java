package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        //crear objeto raton
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo.toString());

        //crear objeto teclado
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        //System.out.println(tecladoLenovo.toString());

        //crear objeto monitor
        Monitor monitorLenovo = new Monitor("Lenovo", 2.5);
        //System.out.println(monitorLenovo.toString());

        //crear objeto commputadora
        Computadora computadorLenovo = new Computadora("Computadora lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadorLenovo);

        //Objeto computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("Usb", "Dell");
        Raton ratonDell = new Raton("Usb", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell, tecladoDell, ratonDell);

        //creamos una Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadorLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        // Computadora MC
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("Usb", "Mac");
        Computadora computadoraMac = new Computadora("Mac", monitorMac, tecladoMac, ratonMac);

        //creamos otra Orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraMac);
        System.out.println("");
        orden2.mostrarOrden();

    }
}