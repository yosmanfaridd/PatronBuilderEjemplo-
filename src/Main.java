public class Main {
    public static void main(String[] args) {
        Casa casa = new CasaBuilder()
                .setHabitaciones(3)
                .setBanos(2)
                .setGarage(true)
                .setPatio(true)
                .build();

        System.out.println(casa);
    }
}
