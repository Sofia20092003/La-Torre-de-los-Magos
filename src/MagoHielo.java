public class MagoHielo extends  Mago {

    public MagoHielo(String nombre, double energia) {
        super(nombre, energia);
    }

    @Override
    public void lanzarHechizos() {
        System.out.println(nombre+ " lanza un hechizo de hielo.");
        energia -=15;
    }
}
