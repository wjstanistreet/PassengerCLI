package airport;
import flight.Flight;
import icancel.ICancel;
import passenger.Passenger;

import java.util.ArrayList;

public abstract class Airport implements ICancel {

    private ArrayList<Flight> availableFlights;
    private ArrayList<Passenger> currentPassengers;


    public void cancelFlight(){

    }

}
