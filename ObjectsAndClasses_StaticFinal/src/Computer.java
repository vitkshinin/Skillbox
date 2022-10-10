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

    // Изменение параметров процессора
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

    // Изменение параметров оперативной памяти
    public Computer setRamMemoryType(String memoryType) {
        return new Computer(cpu, ram.setMemoryType(memoryType), storageDevice, screen, keyboard, vendor, name);
    }

    public Computer setRamMemorySize(int memorySize) {
        return new Computer(cpu, ram.setMemorySize(memorySize), storageDevice, screen, keyboard, vendor, name);
    }

    public Computer setRamMemoryWeight(double memoryWeight) {
        return new Computer(cpu, ram.setMemoryWeight(memoryWeight), storageDevice, screen, keyboard, vendor, name);
    }

    // Изменение параметров накопителя информации
    public Computer setStorageDeviceType(StorageDeviceType type) {
        return new Computer(cpu, ram, storageDevice.setType(type), screen, keyboard, vendor, name);
    }

    public Computer setStorageDeviceMemorySize(int memorySize) {
        return new Computer(cpu, ram, storageDevice.setMemorySize(memorySize), screen, keyboard, vendor, name);
    }

    public Computer setStorageDeviceMemoryWeight(double weight) {
        return new Computer(cpu, ram, storageDevice.setWeight(weight), screen, keyboard, vendor, name);
    }

    // Изменение параметров Экрана
    public Computer setScreenDiagonal(double diagonal) {
        return new Computer(cpu, ram, storageDevice, screen.setDiagonal(diagonal), keyboard, vendor, name);
    }

    public Computer setScreenType(ScreenType type) {
        return new Computer(cpu, ram, storageDevice, screen.setType(type), keyboard, vendor, name);
    }

    public Computer setScreenWeight(double weight) {
        return new Computer(cpu, ram, storageDevice, screen.setWeight(weight), keyboard, vendor, name);
    }

    // Изменение параметров клавиатуры
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
