package mundopc.modelo;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //no se llama desde otras clases, pero sirve para inicializar atributos
    private Monitor() {
        //por cada objeto se inicializa el idMonitor
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this(); //llama al constructor privado de forma interna
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
