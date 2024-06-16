package strategy;

public class RutaMasEconomica implements RutaStrategy{
    public String calcularRuta(String puntoA, String puntoB){
        System.out.println("Tomar la ruta con menos trafico y semaforos entre los dos puntos");
        return "Ruta más economica entre: "+puntoA +" y "+ puntoB;
    }
}
