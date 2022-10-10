public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 40, 1, 1000);
        basket.add("Хлеб", 30, 2, 200);
        basket.print("Корзина 1");
        basket.total();

        System.out.println();
        Basket basket2 = new Basket();
        basket2.add("Сахар", 45, 3, 900);
        basket2.add("Мука", 60 , 1, 1000);
        basket2.print("Корзина 2");
        basket2.total();

        System.out.println();
        Basket basket3 = new Basket();
        basket3.add("Макароны", 120, 2, 300);
        basket3.add("Мороженое", 100, 4, 100);
        basket3.print("Корзина 3");
        basket3.total();

        System.out.println();
        System.out.println("Общая стоимость всех корзин: " + Basket.getItemsTotalPrice() + " руб.");
        System.out.println("Общая количество товаров в корзинах: " + Basket.getItemsTotalCount() + " шт.");
        System.out.println("Средняя цена товаров в корзине: " + Basket.getCalculateAverageItemsPrice() + " руб.");
        System.out.println("Средняя стоимость корзины: " + Basket.getCalculateAverageBasketPrice() + " руб.");

    }
}
