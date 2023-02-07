import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        Pattern phone = Pattern.compile("\\+[7]\\d{10}");
        Pattern email = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

        String[] components = data.split("\\s+");

        if (components.length != 4) {
            throw new IllegalArgumentException("Wrong format! Correct format: \n" +
                    "add Иван Иванов ivan.ivanov@gmail.com +79101234567");
        }

        Matcher emailCheck = email.matcher(components[INDEX_EMAIL]);
        if (!emailCheck.matches()) {
            throw new IllegalArgumentException("Wrong email format! Correct format: \n" +
                    "ivan.ivanov@gmail.com");
        }

        Matcher phoneCheck = phone.matcher(components[INDEX_PHONE]);
        if (!phoneCheck.matches()) {
            throw new IllegalArgumentException("Wrong phone number format! Correct format:: \n" +
                    "+79101234567");
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}