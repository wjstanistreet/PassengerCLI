import passenger.Passenger;
import flight.Flight;
import java.util.Date;
import java.util.Scanner;

public class Runner {
        public static void main(String[] args) {
            //App Date
                Date currentDate = new Date();

                System.out.println("Date:" + currentDate);

                // identifiers for passengers and flights
                        Passenger passenger1 = new Passenger("Ronaldo",0123456,"CR7GOAT");

                        Flight flight1 = new Flight ("Qatar", "QTR1231", "12345", currentDate);

            
            // Input init§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
            Scanner test = new Scanner(System.in);
            String appInput = test.nextLine();
            //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§




        }
}

