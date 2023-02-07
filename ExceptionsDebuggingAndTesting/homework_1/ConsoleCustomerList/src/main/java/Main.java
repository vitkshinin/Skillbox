import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final String ADD_COMMAND = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static final String COMMAND_EXAMPLES = "\t" + ADD_COMMAND + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final String helpText = "Command examples:\n" + COMMAND_EXAMPLES;

    public static void main(String[] args) {

        Logger logger = LogManager.getRootLogger();

        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();

        logger.log(Level.WARN,"Error message");

        while (true) {
            try {
                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);


                if (tokens[0].equals("add")) {
                    executor.addCustomer(tokens[1]);
                    logger.info("COMMAND 'ADD' (new customer): " + tokens[1]);
                } else if (tokens[0].equals("list")) {
                    executor.listCustomers();
                    logger.info("COMMAND 'LIST' (list of customers)");
                } else if (tokens[0].equals("remove")) {
                    executor.removeCustomer(tokens[1]);
                    logger.info("COMMAND 'REMOVE' (the customer: " + tokens[1] + " has been removed");
                } else if (tokens[0].equals("count")) {
                    System.out.println("There are " + executor.getCount() + " customers");
                } else if (tokens[0].equals("help")) {
                    System.out.println(helpText);
                    logger.info("COMMAND 'HELP' (list of commands was requested)");
                } else {
                    System.out.println(COMMAND_ERROR);
                    logger.error("'ERROR' (wrong command has been entered): " + tokens[0]);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
