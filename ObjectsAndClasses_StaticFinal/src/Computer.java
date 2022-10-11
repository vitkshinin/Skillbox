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
        return "Брэнд: " + name + "\n" +
                "Поставщик: " + vendor + "\n" +
                "Процессор: " + "\n" +
                " " + "Частота: " + cpu.getFrequency() + " ГГц" + "\n" +
                " " + "Количество ядер: " + cpu.getNumberOfCores() + "\n" +
                " " + "Производитель: " + cpu.getManufacture() + "\n" +
                " " + "Вес: " + cpu.getWeight() + " гр." + "\n" +
                "Оперативная память: " + "\n" +
                " " + "Тип: " + ram.getMemoryType() + "\n" +
                " " + "Объем: " + ram.getMemorySize() + " ГБ" + "\n" +
                " " + "Вес: " + ram.getMemoryWeight() + " гр." + "\n" +
                "Накопитель информации: " + "\n" +
                " " + "Тип: " + storageDevice.getType() + "\n" +
                " " + "Объем памяти: " + storageDevice.getMemorySize() + " ГБ" + "\n" +
                " " + "Вес: " + storageDevice.getWeight() + " гр." + "\n" +
                "Экран: " + "\n" +
                " " + "Диагональ: " + screen.getDiagonal() + "\n" +
                " " + "Тип: " + screen.getType() + "\n" +
                " " + "Вес: " + screen.getWeight() + " гр." + "\n" +
                "Клавиатура: " +  "\n" +
                " " + "Тип: " + keyboard.getType() + "\n" +
                " " + "Наличие подстветки: " + keyboard.isBacklight() + "\n" +
                " " + "Вес: " + keyboard.getWeight() + " гр." + "\n" +
                "Общий вес компьютера: " + getTotalWeight() + " гр.";

    }
}
