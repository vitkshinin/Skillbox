public class Main {

    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Milk", 80, 1, 1);
        vasyaBasket.add("Bubble gum", 30, 1, 0.2);
        vasyaBasket.print("Vasya's basket:");
        vasyaBasket.getTotalWeight();
        System.out.println();
        Basket mashaBasket = new Basket();
        mashaBasket.add("Bread", 40);
        mashaBasket.print("Masha's basket:");
    }
}
