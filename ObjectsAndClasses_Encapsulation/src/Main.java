import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("������� ����� �����: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }

//    Dimensions dimensions = new Dimensions(18, 25, 26);
//    CourierService cargo = new CourierService(dimensions, 10, "�. �����, ��. �������, �.19", true, "123", false);
//        System.out.println(cargo.toString());
//        System.out.println();
//
//    Dimensions copyDimensions = dimensions.setHeight(30);
//    CourierService cargoCopy = cargo.setDeliveryAddress("�. �����, ������������� �����, �.34").setDimensions(copyDimensions);
//        System.out.println(cargoCopy.toString());
//    }
    }
}