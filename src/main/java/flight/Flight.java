package flight;

import airport.Airport;
import interfacesPackage.ISum;
import passenger.Passenger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Flight{
    private String name;
    private String id;
    private ArrayList<Passenger> flightPassengers;
    private String planeId;
    private Date date;

    public Flight(String name, String id, String planeId, Date date){
        this.name = name;
        this.id = id;
        this.planeId = planeId;
        this.date = date;
        this.flightPassengers = new ArrayList<>();
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
