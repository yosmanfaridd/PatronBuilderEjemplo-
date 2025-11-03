public class Casa {
    private int habitaciones;
    private int banos;
    private boolean garage;
    private boolean patio;

    public Casa(int habitaciones, int banos, boolean garage, boolean patio) {
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.garage = garage;
        this.patio = patio;
    }

    @Override
    public String toString() {
        return "Casa [habitaciones=" + habitaciones +
               ", banos=" + banos +
               ", garage=" + garage +
               ", patio=" + patio + "]";
    }
}
