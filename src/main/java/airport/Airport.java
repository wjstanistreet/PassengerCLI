package airport;
import flight.Flight;
import icancel.ICancel;
import passenger.Passenger;

import java.util.ArrayList;

public abstract class Airport implements ICancel {


    private static String airportName;
    private static ArrayList<Flight> availableFlights = new ArrayList<>();
    private static ArrayList<Passenger> currentPassengers = new ArrayList<>();

    public Airport(String airportName){this.airportName = airportName;}



    //Methods§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§

//Display Flight
   public static void displayFlight(){
        System.out.println("These are the flights: " + availableFlights);
    }

//Display Passenger
    public static void displayPassenger(){
        System.out.println("These are the flights: " + currentPassengers);
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

    //Adding Flights
    public static void addFlights( Flight flight){
        this.getAvailableFlights().add(flight);
    }

    public static void addPassenger(Passenger passenger){
        this.currentPassengers.add(passenger);
    }

    //Removing flights
    public static void cancelFlight(Flight flight){
        for (int i1 = 0; i1 <= availableFlights.size(); i1++) {

            if (availableFlights.get(i1) == flight) {
                availableFlights.remove(flight);
                System.out.println("The flight has been removed");

            } else {
                System.out.println("This flight does not exist");
            }
        }
    }

    //Booking a flight
    public static void bookPassenger(Passenger passenger, Flight flight){
        flight.getFlightPassengers().add(passenger);
    }

    public int countFlights(){

        return this.availableFlights.size();
    }

    public int countPassengers(){
        return this.currentPassengers.size();
    }

//Getters and Setters
    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public ArrayList<Flight> getAvailableFlights() {
        return availableFlights;
    }

    public void setAvailableFlights(ArrayList<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public ArrayList<Passenger> getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(ArrayList<Passenger> currentPassengers) {
        this.currentPassengers = currentPassengers;
    }
}
