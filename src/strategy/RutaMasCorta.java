package strategy;

public class RutaMasCorta implements RutaStrategy{
    public String calcularRuta(String puntoA, String puntoB){
        System.out.println("Tomar la ruta con menos km entre los dos puntos");
        return "Ruta más corta entre: "+puntoA +" y "+ puntoB;
    }
}
