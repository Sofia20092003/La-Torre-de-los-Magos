public class Main {
    public static void main(String[] args) {
        Double potencia= 50.0;

        TorreMagica torre= new TorreMagica();
        Mago mago = new MagoFuego("Gandalf", 200);

        torre.getHabitantes().add(mago);


        TorreMagica.realizarRitual(
                torre.getHabitantes().get(0),
                potencia
        );

        System.out.println("Energia del mago: "+mago.getEnergia());
        System.out.println("Potencia: "+potencia);
    }
}
