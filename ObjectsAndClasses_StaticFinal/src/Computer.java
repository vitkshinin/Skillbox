public class Computer {

    private Cpu cpu;
    private Ram ram;
    private StorageDevice storageDevice;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

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

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public void setRam(Ram ram) {
        this.ram = ram;
    }
    public void setStorageDevice(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalWeight() {
        return cpu.getWeight() + ram.getMemoryWeight() + storageDevice.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
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
