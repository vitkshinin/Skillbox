public class CourierService {

    private final Dimensions dimensions; //��������
    private final double weight; // ���
    private final String deliveryAddress; // ����� ��������
    private final boolean overturned�argo;
    private final String registrationNumber;
    private final boolean fragile�argo;

    public CourierService(Dimensions dimensions,
                          double weight,
                          String deliveryAddress,
                          boolean overturned�argo,
                          String registrationNumber,
                          boolean fragile�argo) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.overturned�argo = overturned�argo;
        this.registrationNumber = registrationNumber;
        this.fragile�argo = fragile�argo;
    }

    public CourierService setDimensions(Dimensions dimensions) {
        return new CourierService(dimensions, weight, deliveryAddress, overturned�argo, registrationNumber, fragile�argo);
    }

    public CourierService setWeight(int weight) {
        return new CourierService(dimensions, weight, deliveryAddress, overturned�argo, registrationNumber, fragile�argo);
    }

    public CourierService setDeliveryAddress(String deliveryAddress) {
        return new CourierService(dimensions, weight, deliveryAddress, overturned�argo, registrationNumber, fragile�argo);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isOverturned�argo() {
        return overturned�argo;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile�argo() {
        return fragile�argo;
    }

    public String toString() {
        return "�������� �����:" + "\n" + dimensions + "\n" +
                "���������� � �����>:" + "\n" +
                "   �����: " + weight + " ��." + "\n" +
                "   ����� ��������: " + deliveryAddress + "\n" +
                "   ����� �� ��������������: " + overturned�argo + "\n" +
                "   ��������������� �����: " + registrationNumber + "\n" +
                "   ������� ����: " + fragile�argo;
    }
}
