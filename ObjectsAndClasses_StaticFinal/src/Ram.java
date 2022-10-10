public class Ram {

    private final String memoryType;
    private final int memorySize;
    private final double memoryWeight;

    public Ram(String memoryType, int memorySize, double memoryWeight) {
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.memoryWeight = memoryWeight;
    }

    public Ram setMemoryType(String memoryType) {
        return new Ram (memoryType, memorySize, memoryWeight);
    }

    public Ram setMemorySize(int memorySize) {
        return new Ram (memoryType, memorySize, memoryWeight);
    }

    public Ram setMemoryWeight(double memoryWeight) {
        return new Ram (memoryType, memorySize, memoryWeight);
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getMemoryWeight() {
        return memoryWeight;
    }
}
