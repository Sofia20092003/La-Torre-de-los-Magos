import java.util.ArrayList;

public abstract class Mago {
    protected String nombre;
    protected double energia;
    protected ArrayList<String> hechizos;

    protected static int totalMagiaMundial=1000;

    public Mago(String nombre, double energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos= new ArrayList<>();
    }

    public double getEnergia() {
        return energia;
    }

    public abstract void lanzarHechizos();
}
