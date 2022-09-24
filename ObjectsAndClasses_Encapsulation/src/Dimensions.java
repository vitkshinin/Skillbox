public class Dimensions {
    private final double width; //ширина
    private final double length; // длина
    private final double height; // высота

    public Dimensions(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, length, height);
    }

    public double getLength() {
        return length;
    }

    public Dimensions setLength(double length) {
        return new Dimensions(width, length, height);
    }

    public double getHeight() {
        return height;
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(width, length, height);
    }


    public double cargoVolume() {
        return (width * length * height);
    }

    public String toString() {
        return "   Ширина: " + width + " см." + "\n" +
                "   Длина: " + length + " см." + "\n" +
                "   Высота: " + height + " см." + "\n" +
                "   Общий объем товара: " + (cargoVolume() / 1000000) + " куб. м.;";
    }

}
