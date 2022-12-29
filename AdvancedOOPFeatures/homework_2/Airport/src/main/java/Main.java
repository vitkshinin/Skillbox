import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Airport airport = Airport.getInstance();
        List<Flight> flightList = findPlanesLeavingInTheNextTwoHours(airport);
        flightList.forEach(System.out::println);
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        final int TWO_HOURS = 7_200_000;
        return airport.getTerminals().stream()
                .map(Terminal::getFlights)
                .flatMap(List::stream)
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE
                && flight.getDate().getTime() > System.currentTimeMillis()
                && flight.getDate().getTime() < System.currentTimeMillis() + TWO_HOURS).collect(Collectors.toList());
    }

}