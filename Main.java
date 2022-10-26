import EjerciciosTema4.SmartDevice;
import EjerciciosTema4.SmartPhone;
import EjerciciosTema4.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone SamsungS22 = new SmartPhone("Samsung S22",6.1, "Octa-core", 50,3700);
        SmartWatch MiBand6 = new SmartWatch("Xiaomi MiBand6", 1.56, "tpu", true);

        System.out.println(SamsungS22.modelo);
        System.out.println("Pantalla: " + SamsungS22.pantalla + "''");
        System.out.println("Procesador: " + SamsungS22.procesador);
        System.out.println("Camara: " + SamsungS22.camara + "mpx");
        System.out.println("Bateria: " + SamsungS22.bateria + "mha");

        System.out.println(MiBand6.modelo);
        System.out.println("Pantalla: " + MiBand6.pantalla + "''");
        System.out.println("Material de la malla: " + MiBand6.material);
        System.out.println("Sumergible: " + MiBand6.sumergible);

    }
}