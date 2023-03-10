public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("??????", 40, 1, 1000);
        basket.add("????", 30, 2, 200);
        basket.print("??????? 1");
        basket.total();

        System.out.println();
        Basket basket2 = new Basket();
        basket2.add("?????", 45, 3, 900);
        basket2.add("????", 60 , 1, 1000);
        basket2.print("??????? 2");
        basket2.total();

        System.out.println();
        Basket basket3 = new Basket();
        basket3.add("????????", 120, 2, 300);
        basket3.add("?????????", 100, 4, 100);
        basket3.print("??????? 3");
        basket3.total();

        System.out.println();
        System.out.println("????? ????????? ???? ??????: " + Basket.getItemsTotalPrice() + " ???.");
        System.out.println("????? ?????????? ??????? ? ????????: " + Basket.getItemsTotalCount() + " ??.");
        System.out.println("??????? ???? ??????? ? ???????: " + Basket.getCalculateAverageItemsPrice() + " ???.");
        System.out.println("??????? ????????? ???????: " + Basket.getCalculateAverageBasketPrice() + " ???.");
        System.out.println();


        Cpu cpu = new Cpu(1.8,2, "Intel", 100);
        Ram ram = new Ram("DDR4", 4, 150);
        StorageDevice storageDevice = new StorageDevice(StorageDeviceType.SSD, 1000, 350);
        Screen screen = new Screen(15.6, ScreenType.IPS, 1000);
        Keyboard keyboard = new Keyboard("????????????", true, 750);

        Cpu cpu2 = new Cpu(2.4, 4, "Intel", 110);
        Ram ram2 = new Ram("DDR4", 8, 200);
        StorageDevice storageDevice2 = new StorageDevice(StorageDeviceType.SSD, 512, 300);
        Screen screen2 = new Screen(14, ScreenType.IPS, 700);
        Keyboard keyboard2 = new Keyboard("?????????", true, 500);

        Cpu cpu3 = new Cpu(2.7, 6, "Intel", 150);
        Ram ram3 = new Ram("DDR4", 16, 200);
        StorageDevice storageDevice3 = new StorageDevice(StorageDeviceType.SSD, 512, 400);
        Screen screen3 = new Screen(15.6, ScreenType.IPS, 600);
        Keyboard keyboard3 = new Keyboard("??????????", false, 400);

        Computer computerAsus = new Computer("DNS", "Asus");
        computerAsus.setCpu(cpu);
        computerAsus.setRam(ram);
        computerAsus.setStorageDevice(storageDevice);
        computerAsus.setScreen(screen);
        computerAsus.setKeyboard(keyboard);

        Computer computerHuawei = new Computer("DNS", "Huawei ");
        computerHuawei.setCpu(cpu2);
        computerHuawei.setRam(ram2);
        computerHuawei.setStorageDevice(storageDevice2);
        computerHuawei.setScreen(screen2);
        computerHuawei.setKeyboard(keyboard2);

        Computer computerMsi = new Computer("?.?????", "MSI");
        computerMsi.setCpu(cpu3);
        computerMsi.setRam(ram3);
        computerMsi.setStorageDevice(storageDevice3);
        computerMsi.setScreen(screen3);
        computerMsi.setKeyboard(keyboard3);

        System.out.println("??????? 6.8.2");
        System.out.println(computerAsus.toStringComputer());
        System.out.println("----------------------------------");
        System.out.println(computerHuawei.toStringComputer());
        System.out.println("----------------------------------");
        System.out.println(computerMsi.toStringComputer());

    }
}
