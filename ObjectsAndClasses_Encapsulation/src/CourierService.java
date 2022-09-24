public class CourierService {

    private final Dimensions dimensions; //ãàáàğèòû
    private final double weight; // âåñ
    private final String deliveryAddress; // àäğåñ äîñòàâêì
    private final boolean overturnedÑargo;
    private final String registrationNumber;
    private final boolean fragileÑargo;

    public CourierService(Dimensions dimensions,
                          double weight,
                          String deliveryAddress,
                          boolean overturnedÑargo,
                          String registrationNumber,
                          boolean fragileÑargo) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.overturnedÑargo = overturnedÑargo;
        this.registrationNumber = registrationNumber;
        this.fragileÑargo = fragileÑargo;
    }

    public CourierService setDimensions(Dimensions dimensions) {
        return new CourierService(dimensions, weight, deliveryAddress, overturnedÑargo, registrationNumber, fragileÑargo);
    }

    public CourierService setWeight(int weight) {
        return new CourierService(dimensions, weight, deliveryAddress, overturnedÑargo, registrationNumber, fragileÑargo);
    }

    public CourierService setDeliveryAddress(String deliveryAddress) {
        return new CourierService(dimensions, weight, deliveryAddress, overturnedÑargo, registrationNumber, fragileÑargo);
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

    public boolean isOverturnedÑargo() {
        return overturnedÑargo;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragileÑargo() {
        return fragileÑargo;
    }

    public String toString() {
        return "Ãàáàğèòû ãğóçà:" + "\n" + dimensions + "\n" +
                "Èíôîğìàöèÿ î ãğóçå>:" + "\n" +
                "   Ìàññà: " + weight + " êã." + "\n" +
                "   Àäğåñ äîñòàâêè: " + deliveryAddress + "\n" +
                "   Ìîæíî ëè ïåğåâîğà÷èâàòü: " + overturnedÑargo + "\n" +
                "   Ğåãèñòğàöèîííûé íîìåğ: " + registrationNumber + "\n" +
                "   Õğóïêèé ãğóç: " + fragileÑargo;
    }
}
