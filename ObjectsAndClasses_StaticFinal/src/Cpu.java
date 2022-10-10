public class Cpu {

    private final double frequency;
    private final int numberOfCores;
    private final String manufacture;
    private final double weight;

    public Cpu(double frequency, int numberOfCores, String manufacture, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacture = manufacture;
        this.weight = weight;
    }

    public Cpu setFrequency(double frequency) {
        return new Cpu(frequency, numberOfCores, manufacture, weight);
    }

    public Cpu setNumberOfCores(int numberOfCores) {
        return new Cpu(frequency, numberOfCores, manufacture, weight);
    }

    public Cpu setManufacture(String manufacture) {
        return new Cpu(frequency, numberOfCores, manufacture, weight);
    }

    public Cpu setWeight(double weight) {
        return new Cpu(frequency, numberOfCores, manufacture, weight);
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacture() {
        return manufacture;
    }

    public double getWeight() {
        return weight;
    }
}

