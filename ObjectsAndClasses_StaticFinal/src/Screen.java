public class Screen {

    private final double diagonal;
    private final ScreenType type;
    private final double weight;

    public Screen(double diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public Screen setDiagonal(double diagonal) {
        return new Screen(diagonal, type, weight);
    }

    public Screen setType(ScreenType type) {
        return new Screen(diagonal, type, weight);
    }

    public Screen setWeight(double weight) {
        return new Screen(diagonal, type, weight);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

}
