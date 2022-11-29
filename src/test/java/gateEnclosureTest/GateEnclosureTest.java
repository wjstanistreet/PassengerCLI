package gateEnclosureTest;
import flight.Flight;
import gateEnclosure.GateEnclosure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import passenger.Passenger;
import airport.Airport;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GateEnclosureTest {

    Date currentDate = new Date();
    GateEnclosure gateEnclosure;

    @BeforeEach
    public void setup(){
        gateEnclosure = new GateEnclosure ("Gate 9","Changi Airport");
    }

    @Test
    public void countingFlight() {
        int expected = 3;
        int actual = gateEnclosure.countFlights();
        assertEquals(expected, actual);
    }

    @Test
    public void countingPassengers() {
        int expected = 0;
        int actual = gateEnclosure.countPassengers();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddFlights() {
        Date currentDate = new Date();

        Flight flight1 = new Flight ("Qatar airways", "QTR1231", "1234", currentDate);
        Flight flight2 = new Flight ("Singapore Airplines", "SG8800", "1069", currentDate);
        Flight flight3 = new Flight ("Air India", "IND6900", "9687", currentDate);
        Flight flight4 = new Flight ("Japan Airways", "JPN1200", "0316", currentDate);

        gateEnclosure.addFlights(flight2);
        gateEnclosure.addFlights(flight3);
        gateEnclosure.addFlights(flight4);

        int expected = 3;
        int actual = gateEnclosure.countFlights();

        assertEquals(expected, actual);
    }

    @Test

    public void addPassenger(){
        Passenger passenger1 = new Passenger("Ronaldo","0123456","CR7GOAT");
        Passenger passenger2 = new Passenger("Messi","809090","P5SSI");
        Passenger passenger3 = new Passenger("Nick Tron","00112233","L0L1230");


        gateEnclosure.addPassenger(passenger1);
        gateEnclosure.addPassenger(passenger2);

        int expected = 2;
        int actual = gateEnclosure.countPassengers();

        assertEquals(expected, actual);
    }

    @Test

    public void displayFlights(){
        ArrayList expected = gateEnclosure.getAvailableFlights();

        ArrayList actual = gateEnclosure.getAvailableFlights();

        assertEquals(expected, actual);

    }

    public void displayPassenger(){

        ArrayList expected = gateEnclosure.getCurrentPassengers();

        ArrayList actual = gateEnclosure.getCurrentPassengers();

        assertEquals(expected, actual);

    }
}

