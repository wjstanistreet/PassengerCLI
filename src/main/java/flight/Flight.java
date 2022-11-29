package flight;

import passenger.Passenger;

import java.util.ArrayList;
import java.util.Date;

public class Flight{
    private String name;
    private String id;
    private ArrayList<Passenger> flightPassengers = new ArrayList<>();
    private String planeId;
    private Date date;

    public Flight(String name, String id, String planeId, Date date){
        this.name = name;
        this.id = id;
        this.planeId = planeId;
        this.date = date;
        this.flightPassengers = new ArrayList<>();
    }

    public Flight(){

    }


    public void displayFlightPassenger(){
        System.out.println("These are the passengers on this flight: ");
        for (int i = 0; i < this.flightPassengers.size(); i++) {
            Passenger display = this.flightPassengers.get(i);
            System.out.println((i+1) + ": " + " Passenger name " + this.flightPassengers.get(i).getName());
        }
    }


//Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Passenger> getFlightPassengers() {
        return flightPassengers;
    }

    public void setFlightPassengers(ArrayList<Passenger> flightPassengers) {
        this.flightPassengers = flightPassengers;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
