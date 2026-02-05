public class MagoFuego extends Mago {

    public MagoFuego(String nombre, double energia) {
        super(nombre, energia);
    }

    @Override
    public void lanzarHechizos() {
        System.out.println(nombre+" lanza una bola de fuego.");
        energia -=20;
    }
}
