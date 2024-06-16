package strategy;

public class RutaMasRapida implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB){
        System.out.println("Tomar la ruta con menos curvas entre los dos puntos");
        return "Ruta más rapida entre: "+puntoA +" y "+ puntoB;
    }
}
