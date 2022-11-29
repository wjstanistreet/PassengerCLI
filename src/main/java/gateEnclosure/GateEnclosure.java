package gateEnclosure;

import airport.Airport;
import flight.Flight;
import passenger.Passenger;

import java.awt.*;
import java.util.ArrayList;

public class GateEnclosure extends Airport {

    private String gateName;
    private static ArrayList<Flight> availableFlights = new ArrayList<>();
    private static ArrayList<Passenger> currentPassengers = new ArrayList<>();

    public GateEnclosure(String name, String airportName){
        super(airportName);
        this.gateName = name;
    }

    //Adding Flights
    public static void addFlights( Flight flight){
        availableFlights.add(flight);
    }

    public static void addPassenger(Passenger passenger){
        currentPassengers.add(passenger);
    }

    public int countFlights(){
        return availableFlights.size();
    }

    public int countPassengers(){
        return currentPassengers.size();
    }

    //Display Flight
    public static void displayFlight(){
        System.out.println("These are the available flights: ");
        for (int i = 0; i < availableFlights.size(); i++) {
          Flight display = availableFlights.get(i);
            System.out.println((i+1) + ": " + " Flight name " + display.getName());
        }
    }

    //Display Passenger
    public static void displayPassenger(){
        System.out.println("These are the passengers: ");
        for (int i = 0; i < currentPassengers.size(); i++) {
            Passenger display = currentPassengers.get(i);
            System.out.println((i+1) + ": " + " Passenger name " + currentPassengers.get(i).getName());
        }
    }

    //Add Passenger
    public static void removePassenger(Passenger passenger){
        for (int i1 = 0; i1 <= currentPassengers.size(); i1++) {

            if (currentPassengers.get(i1) == passenger) {

                currentPassengers.remove(passenger);
                System.out.println("Your booking is no longer available");

            } else {
                System.out.println("This booking does not exist");

            }
        }
    }

    //Removing flights
    public static void cancelFlight(Flight flight){
        availableFlights.remove(flight);
        System.out.println("The flight has been removed");
    }

    //Booking a flight
    public static void bookPassenger(Passenger passenger, Flight flight){
        flight.getFlightPassengers().add(passenger);
    }


    @Override
    public void cancelFlight() {

    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public ArrayList<Flight> getAvailableFlights() {
        return availableFlights;
    }

    public void setAvailableFlights(ArrayList<Flight> availableFlights) {
        GateEnclosure.availableFlights = availableFlights;
    }

    public ArrayList<Passenger> getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(ArrayList<Passenger> currentPassengers) {
        GateEnclosure.currentPassengers = currentPassengers;
    }
}
