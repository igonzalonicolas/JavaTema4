package EjerciciosTema4;

public class SmartWatch extends SmartDevice{
    public String material;
    public Boolean sumergible;

    public SmartWatch(){}
    public SmartWatch(String modelo, double pantalla, String material, Boolean sumergible){
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.material = material;
        this.sumergible = sumergible;
    }
}
