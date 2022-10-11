public class Basket {

    private static int count = 0;
    private static int itemsTotalPrice = 0;
    private static int itemsTotalCount = 0;

    private String items = "";
    private int totalPrice = 0;
    private int limit;
    double totalWeight = 0.0;


    public Basket() {
        increaseTotalPrice(0);
        increaseTotalCount(0);
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static int increaseTotalCount(int itemsTotalCount) {
        Basket.itemsTotalCount = Basket.itemsTotalCount + itemsTotalCount;
        return itemsTotalCount;
    }

    public static int increaseTotalPrice(int itemsTotalPrice) {
        Basket.itemsTotalPrice = Basket.itemsTotalPrice + itemsTotalPrice;
        return itemsTotalPrice;
    }

    public static double calculateAveragePrice() {
        return itemsTotalPrice / itemsTotalCount;
    }

    public static double calculateAverageBasketPrice() {
        return itemsTotalPrice / Basket.count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0.0);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0.0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб. - " + weight + " гр.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        increaseTotalPrice(count * price);
        increaseTotalCount(count);
    }

    public static int getItemsTotalCount() {
        return itemsTotalCount;
    }

    public static int getItemsTotalPrice() {
        return itemsTotalPrice;
    }

    public static double getCalculateAverageItemsPrice() {
        return calculateAveragePrice();
    }

    public static double getCalculateAverageBasketPrice() {
        return calculateAverageBasketPrice();
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void total() {
        System.out.println("Общий вес товара: " + totalWeight + " гр." + "\n" +
                "Общая стоимость товара: " + totalPrice + " руб.");
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("The basket is empty");
        } else {
            System.out.println(items);
        }
    }
}
