package flight;

import airport.Airport;
import passenger.Passenger;

import java.time.LocalDate;
import java.util.ArrayList;

public class Flight extends Airport {
    private String name;
    private String id;
    private ArrayList<Passenger> flightPassengers;
    private String planeId;
    private LocalDate date;

    public Flight(String name, String id, String planeId, LocalDate date){
        this.name = name;
        this.id = id;
        this.planeId = planeId;
        this.date = date;
        this.flightPassengers = new ArrayList<>();
    }

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
