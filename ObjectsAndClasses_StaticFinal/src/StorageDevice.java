public class StorageDevice {

    private final StorageDeviceType type;
    private final int memorySize;
    private final double weight;

    public StorageDevice(StorageDeviceType type, int memorySize, double weight) {
        this.type = type;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public StorageDevice setType(StorageDeviceType type) {
        return new StorageDevice(type, memorySize, weight);
    }

    public StorageDevice setMemorySize(int memorySize) {
        return new StorageDevice(type, memorySize, weight);
    }

    public StorageDevice setWeight(double weight) {
        return new StorageDevice(type, memorySize, weight);
    }

    public StorageDeviceType getType() {
        return type;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }
}
