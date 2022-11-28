package airport;
import flight.Flight;
import icancel.ICancel;
import passenger.Passenger;

import java.util.ArrayList;

public abstract class Airport implements ICancel {


    private String airportName;
    private ArrayList<Flight> availableFlights = new ArrayList<>();
    protected ArrayList<Passenger> currentPassengers = new ArrayList<>();

    public Airport(String airportName){this.airportName = airportName;}



    //Methods§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§

//Display Flight

 void displayFlight(){
    System.out.println("These are the flights: " + availableFlights);
}

//Display Passenger
void displayPassenger(){
    System.out.println("These are the flights: " + currentPassengers);
}

//Add Passagener
void removePassenger(Passenger passenger){
        for (int i1 = 0; i1 <= currentPassengers.size(); i1++) {

            if (currentPassengers.get(i1) == passenger) {

                currentPassengers.remove(passenger);
                System.out.println("Your booking is no longer available");

            } else {
                System.out.println("This booking does not exist");

            }
        }
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
