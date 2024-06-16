import strategy.NavegadorGPS;
import strategy.RutaMasCorta;
import strategy.RutaMasEconomica;
import strategy.RutaMasRapida;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");
        System.out.println("");
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");
        System.out.println("");
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");
    }
}