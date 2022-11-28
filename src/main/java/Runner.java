import airport.Airport;
import passenger.Passenger;
import flight.Flight;
import java.util.Date;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //App Date
        Date currentDate = new Date();

        System.out.println("Date:" + currentDate);

        // identifiers for passengers§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Passenger passenger1 = new Passenger("Ronaldo",0123456,"CR7GOAT");
        Passenger passenger2 = new Passenger("Messi",809090,"P5SSI");
        Passenger passenger3 = new Passenger("Nick Tron",00112233,"L0L1230");

//§§§§§§§§§§§§§§§§§§§§§§§§§§§§§ Scanner Input §§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Scanner test = new Scanner(System.in);

        // identifiers for Flight§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Flight flight1 = new Flight ("Qatar airways", "QTR1231", "1234", currentDate);
        Flight flight2 = new Flight ("Singapore Airplines", "SG8800", "1069", currentDate);
        Flight flight3 = new Flight ("Air India", "IND6900", "9687", currentDate);
        Flight flight4 = new Flight ("Japan Airways", "JPN1200", "0316", currentDate);

        // Input init§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        System.out.println("§§§§§§§§§§§§§§§ Welcome to the SUIII air §§§§§§§§§§§§§§§");
        Runner.optionMenu();

        Integer appInput = test.nextInt();

        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§


        while (appInput != 10){

            Runner.optionMenu();
            appInput = test.nextInt();
        }

    }

















    public static void optionMenu() {
        System.out.println("Please select an integer from the menu: " + "\n" +
                "1. Display flights" + "\n" +
                "2. Display passengers" + "\n" +
                "3. Add new passenger" + "\n" +
                "4. Add new flight" + "\n" +
                "5. Book passenger onto flight" + "\n" +
                "6. Cancel flight" + "\n" +
                "7. Remove passenger from flight" + "\n" +
                "8. Count flights" + "\n" +
                "9. Count passengers" + "\n" +
                "10. Close app");
    }
        public static void option1(Integer appInput) {
            if (appInput == '1'){
                Airport.displayFlight();
            }

        }
}
}


