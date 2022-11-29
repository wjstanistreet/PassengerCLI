import airport.Airport;
import gateEnclosure.GateEnclosure;
import passenger.Passenger;
import flight.Flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Runner {

    static Scanner scanner = new Scanner(System.in);
    static GateEnclosure gateEnclosure;

    public static void main(String[] args) {
        //App Date
        Date currentDate = new Date();

        System.out.println("Date:" + currentDate);
        gateEnclosure = new GateEnclosure("Gate 1", "Qatar Airport");

        // identifiers for passengers§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Passenger passenger1 = new Passenger("Ronaldo", "87889", "CR7GOAT");
        Passenger passenger2 = new Passenger("Messi", "809090", "P5SSI");
        Passenger passenger3 = new Passenger("Mbappe", "00112233", "L0L1230");

        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§ Scanner Input §§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Scanner scanner = new Scanner(System.in);

        // identifiers for Flight§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Flight flight1 = new Flight("Qatar", "QTR1231", "1234", currentDate);
        Flight flight2 = new Flight("Singapore", "SG8800", "1069", currentDate);
        Flight flight3 = new Flight("Air", "IND6900", "9687", currentDate);
        Flight flight4 = new Flight("Japan", "JPN1200", "0316", currentDate);

        // Add Flights
        gateEnclosure.addFlights(flight1);
        gateEnclosure.addFlights(flight2);
        gateEnclosure.addFlights(flight3);
        gateEnclosure.addFlights(flight4);

        //Add Passenger
        gateEnclosure.addPassenger(passenger1);
        gateEnclosure.addPassenger(passenger2);
        gateEnclosure.addPassenger(passenger3);

        // Input init§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        System.out.println("§§§§§§§§§§§§§§§ Welcome to the SUIII air §§§§§§§§§§§§§§§");
        Runner.optionMenu();

        Integer appInput = scanner.nextInt();

        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§


        while (appInput != 10) {
            Runner.optionControl(appInput);
            Runner.optionMenu();
            appInput = scanner.nextInt();
        }
        System.out.println("Thank you for using this app " + " https://st.depositphotos.com/1361798/3407/v/600/depositphotos_34076537-stock-illustration-airplane-symbol-design.jpg");
    }


    public static void optionMenu() {
        System.out.println("Please select an integer from the menu: " + "\n" +
                "1. Display passengers" + "\n" +
                "2. Display flights" + "\n" +
                "3. Add new passenger" + "\n" +
                "4. Add new flight" + "\n" +
                "5. Book passenger onto flight" + "\n" +
                "6. Cancel flight" + "\n" +
                "7. Remove passenger from flight" + "\n" +
                "8. Count flights" + "\n" +
                "9. Count passengers" + "\n" +
                "10. Close app");
    }

    public static void optionControl(Integer appInput) {
        Flight tempFlight;
        if (appInput == 1) {
            gateEnclosure.displayPassenger();

        }
        else if (appInput == 2) {
            gateEnclosure.displayFlight();

        }
        else if (appInput == 3) {
            Passenger newPassenger = new Passenger();
            System.out.println("To add a new passenger, type the name of the passenger:");
            String name = scanner.nextLine();
            newPassenger.setName(name);

            System.out.println("type the id of the passenger:");
            String pID = scanner.nextLine();
            newPassenger.setId(pID);

            System.out.println("type the contact information of the passenger:");
            String contactInfo = scanner.nextLine();
            newPassenger.setContactInfo(contactInfo);
            gateEnclosure.addPassenger(newPassenger);
            System.out.println("Added passenger successfully");
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

        }
        else if (appInput == 4) {
            Flight newFlight = new Flight();
            System.out.println("To add a new flight, type the name of the flight:");
            String name = scanner.nextLine();
            newFlight.setName(name);

            System.out.println("type the id of the flight:");
            String pID = scanner.nextLine();
            newFlight.setId(pID);

            System.out.println("type the id of the plane:");
            String newPlaneID = scanner.nextLine();
            newFlight.setPlaneId(newPlaneID);

            gateEnclosure.addFlights(newFlight);
            System.out.println("Added flight successfully");
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
        }
        else if (appInput == 5) {

            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

            System.out.println("Select what flight you want to be booked on :");
            GateEnclosure.displayFlight();

            int flightInput = scanner.nextInt();

            Passenger tempPassenger;
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

            if (flightInput <= gateEnclosure.countFlights()) {
                tempFlight = gateEnclosure.getAvailableFlights().get(flightInput - 1);

                System.out.println("Select which passenger you want on : " + tempFlight.getName());
                GateEnclosure.displayPassenger();
                int bookPassengerInput = scanner.nextInt();
                Passenger bookPassenger;

                if (bookPassengerInput <= gateEnclosure.countPassengers()) {
                    bookPassenger = gateEnclosure.getCurrentPassengers().remove(bookPassengerInput - 1);
                    tempFlight.getFlightPassengers().add(bookPassenger);

                    System.out.println("You have selected " + bookPassenger.getName() + " on " + tempFlight.getName());
                    System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
                } else {
                    System.out.println("Passenger does not Exist");
                }
            } else {
                System.out.println("Your flight does not exist");
            }
        }
        else if (appInput == 6) {
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            System.out.println("Select the flight you want to cancel");
            GateEnclosure.displayFlight();
            int rmFlightInput = scanner.nextInt();
            Flight rmFlight;

            if (rmFlightInput <= gateEnclosure.countFlights()) {
                rmFlight = gateEnclosure.getAvailableFlights().remove(rmFlightInput - 1);
                System.out.println("You have selected the flight to " + rmFlight.getName() + " to be cancelled");
                System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            } else {
                System.out.println("Your flight does not exist");
            }
        }
        //Cancel Remove passenger from flight
        else if (appInput == 7) {
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

            System.out.println("Select what flight you want to be removed from :");
            GateEnclosure.displayFlight();

            int flightInput = scanner.nextInt();

            Passenger tempPassenger;
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

            if (flightInput <= gateEnclosure.countFlights()) {
                tempFlight = gateEnclosure.getAvailableFlights().get(flightInput - 1);

                System.out.println("Select which passenger you want to remove from : " + tempFlight.getName());
                tempFlight.displayFlightPassenger();
                int rmPassengerInput = scanner.nextInt();
                Passenger rmPassenger;

                if (rmPassengerInput <= tempFlight.getFlightPassengers().size()) {
                    rmPassenger = tempFlight.getFlightPassengers().remove(rmPassengerInput - 1);
                    gateEnclosure.getCurrentPassengers().add(rmPassenger);

                    System.out.println("You have selected " + rmPassenger.getName() + " to be removed from " + tempFlight.getName());
                    System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
                } else {
                    System.out.println("Passenger does not Exist");
                }
            }
        }
        else if (appInput == 8) {

            System.out.println("These are the number of flights departing at " + gateEnclosure.getGateName() + ": " + gateEnclosure.countFlights());
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

        }
        else if (appInput == 9) {

            System.out.println("These are the number of passengers departing at " + gateEnclosure.getGateName() + ": " + gateEnclosure.countPassengers());
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

        }
    }
}



