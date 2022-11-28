package airport;
import flight.Flight;
import icancel.ICancel;
import passenger.Passenger;

import java.util.ArrayList;

public abstract class Airport implements ICancel {


    private String airportName;
    private ArrayList<Flight> availableFlights = new ArrayList<>();
    private ArrayList<Passenger> currentPassengers = new ArrayList<>();

    public Airport(String airportName){this.airportName = airportName;}



    //Methods§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§










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

    public int countFlights(){

        return this.availableFlights.size();
    }

      public int countPassangers(){
        
        return this.currentPassengers.size();
    }
    
    //Adding Flights

public void addFlights( Flight flight){
    this. availableFlights.add(flight);
}

public void addPassenger(Passenger passenger){
    this.currentPassengers.add(passenger);
}
    


    public void cancelFlight(){

    }

}
