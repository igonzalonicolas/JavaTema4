package EjerciciosTema4;

public class SmartPhone extends SmartDevice {

    public String procesador;
    public int camara;
    public int bateria;

    public SmartPhone() {
    }

    public SmartPhone(String modelo, double pantalla, String procesador, int camara, int bateria) {
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.camara = camara;
        this.bateria = bateria;
    }
}
