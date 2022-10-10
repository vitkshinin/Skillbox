public class Computer {

    private Cpu cpu;
    private Ram ram;
    private StorageDevice storageDevice;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Cpu cpu,
                    Ram ram,
                    StorageDevice storageDevice,
                    Screen screen,
                    Keyboard keyboard,
                    String vendor,
                    String name) {
        this.cpu = cpu;
        this.ram = ram;
        this.storageDevice = storageDevice;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    // ��������� ���������� ����������
    public Computer setCpuFrequency(double frequency) {
        return new Computer(cpu.setFrequency(frequency), ram, storageDevice, screen, keyboard, vendor, name);
    }

    public Computer setCpuNumberOfCores(int numberOfCores) {
        return new Computer(cpu.setNumberOfCores(numberOfCores), ram, storageDevice, screen, keyboard, vendor, name);
    }

    public Computer setCpuManufacture(String manufacture) {
        return new Computer(cpu.setManufacture(manufacture), ram, storageDevice, screen, keyboard, vendor, name);
    }

    public Computer setCpuWeight(double weight) {
        return new Computer(cpu.setWeight(weight), ram, storageDevice, screen, keyboard, vendor, name);
    }

    // ��������� ���������� ����������� ������
    public Computer setRamMemoryType(String memoryType) {
        return new Computer(cpu, ram.setMemoryType(memoryType), storageDevice, screen, keyboard, vendor, name);
    }

    public Computer setRamMemorySize(int memorySize) {
        return new Computer(cpu, ram.setMemorySize(memorySize), storageDevice, screen, keyboard, vendor, name);
    }

    public Computer setRamMemoryWeight(double memoryWeight) {
        return new Computer(cpu, ram.setMemoryWeight(memoryWeight), storageDevice, screen, keyboard, vendor, name);
    }

    // ��������� ���������� ���������� ����������
    public Computer setStorageDeviceType(StorageDeviceType type) {
        return new Computer(cpu, ram, storageDevice.setType(type), screen, keyboard, vendor, name);
    }

    public Computer setStorageDeviceMemorySize(int memorySize) {
        return new Computer(cpu, ram, storageDevice.setMemorySize(memorySize), screen, keyboard, vendor, name);
    }

    public Computer setStorageDeviceMemoryWeight(double weight) {
        return new Computer(cpu, ram, storageDevice.setWeight(weight), screen, keyboard, vendor, name);
    }

    // ��������� ���������� ������
    public Computer setScreenDiagonal(double diagonal) {
        return new Computer(cpu, ram, storageDevice, screen.setDiagonal(diagonal), keyboard, vendor, name);
    }

    public Computer setScreenType(ScreenType type) {
        return new Computer(cpu, ram, storageDevice, screen.setType(type), keyboard, vendor, name);
    }

    public Computer setScreenWeight(double weight) {
        return new Computer(cpu, ram, storageDevice, screen.setWeight(weight), keyboard, vendor, name);
    }

    // ��������� ���������� ����������
    public Computer setKeyboardType(String type) {
        return new Computer(cpu, ram, storageDevice, screen, keyboard.setType(type), vendor, name);
    }

    public Computer setKeyboardBacklight(boolean backlight) {
        return new Computer(cpu, ram, storageDevice, screen, keyboard.setBacklight(backlight), vendor, name);
    }

    public Computer setKeyboardWeight(double weight) {
        return new Computer(cpu, ram, storageDevice, screen, keyboard.setWeight(weight), vendor, name);
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getTotalWeight() {
        return cpu.getWeight() + ram.getMemoryWeight() + storageDevice.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public String toStringComputer() {
        return "�����: " + name + "\n" +
                "���������: " + vendor + "\n" +
                "���������: " + "\n" +
                " " + "�������: " + cpu.getFrequency() + " ���" + "\n" +
                " " + "���������� ����: " + cpu.getNumberOfCores() + "\n" +
                " " + "�������������: " + cpu.getManufacture() + "\n" +
                " " + "���: " + cpu.getWeight() + " ��." + "\n" +
                "����������� ������: " + "\n" +
                " " + "���: " + ram.getMemoryType() + "\n" +
                " " + "�����: " + ram.getMemorySize() + " ��" + "\n" +
                " " + "���: " + ram.getMemoryWeight() + " ��." + "\n" +
                "���������� ����������: " + "\n" +
                " " + "���: " + storageDevice.getType() + "\n" +
                " " + "����� ������: " + storageDevice.getMemorySize() + " ��" + "\n" +
                " " + "���: " + storageDevice.getWeight() + " ��." + "\n" +
                "�����: " + "\n" +
                " " + "���������: " + screen.getDiagonal() + "\n" +
                " " + "���: " + screen.getType() + "\n" +
                " " + "���: " + screen.getWeight() + " ��." + "\n" +
                "����������: " +  "\n" +
                " " + "���: " + keyboard.getType() + "\n" +
                " " + "������� ����������: " + keyboard.isBacklight() + "\n" +
                " " + "���: " + keyboard.getWeight() + " ��." + "\n" +
                "����� ��� ����������: " + getTotalWeight() + " ��.";

    }
}
