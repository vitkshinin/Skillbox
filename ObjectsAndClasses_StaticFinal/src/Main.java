public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("������", 40, 1, 1000);
        basket.add("����", 30, 2, 200);
        basket.print("������� 1");
        basket.total();

        System.out.println();
        Basket basket2 = new Basket();
        basket2.add("�����", 45, 3, 900);
        basket2.add("����", 60 , 1, 1000);
        basket2.print("������� 2");
        basket2.total();

        System.out.println();
        Basket basket3 = new Basket();
        basket3.add("��������", 120, 2, 300);
        basket3.add("���������", 100, 4, 100);
        basket3.print("������� 3");
        basket3.total();

        System.out.println();
        System.out.println("����� ��������� ���� ������: " + Basket.getItemsTotalPrice() + " ���.");
        System.out.println("����� ���������� ������� � ��������: " + Basket.getItemsTotalCount() + " ��.");
        System.out.println("������� ���� ������� � �������: " + Basket.getCalculateAverageItemsPrice() + " ���.");
        System.out.println("������� ��������� �������: " + Basket.getCalculateAverageBasketPrice() + " ���.");

    }
}
