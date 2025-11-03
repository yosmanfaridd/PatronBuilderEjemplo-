public class CasaBuilder {
    private int habitaciones;
    private int banos;
    private boolean garage;
    private boolean patio;

    public CasaBuilder setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
        return this;
    }

    public CasaBuilder setBanos(int banos) {
        this.banos = banos;
        return this;
    }

    public CasaBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    public CasaBuilder setPatio(boolean patio) {
        this.patio = patio;
        return this;
    }

    public Casa build() {
        return new Casa(habitaciones, banos, garage, patio);
    }
}
