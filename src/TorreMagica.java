import java.util.ArrayList;

public class TorreMagica {

    private ArrayList<Mago> habitantes;

    public TorreMagica() {
        habitantes = new ArrayList<>();
    }

    public ArrayList<Mago> getHabitantes() {
        return habitantes;
    }

    public void entrenarMagos(){
        for (Mago m: habitantes) {
            m.lanzarHechizos();
        }
    }

    public static void realizarRitual(Mago m, Double potencia){
        m.energia -=30;
        potencia +=100;

        if (Mago.totalMagiaMundial>0){
            Mago.totalMagiaMundial-=10;
        }
    }
}
