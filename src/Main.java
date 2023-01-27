public class Main {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.Agregarpuerta();
        System.out.println(micoche.puerta);
    }
}
class Coche{
    public int puerta = 4;

    public void Agregarpuerta(){
        this.puerta++;
    }
}
