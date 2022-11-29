import airport.Airport;
import passenger.Passenger;
import flight.Flight;
import java.util.Date;
import java.util.Scanner;

public class Runner {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //App Date
        Date currentDate = new Date();

        System.out.println("Date:" + currentDate);

        // identifiers for passengers§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Passenger passenger1 = new Passenger("Ronaldo",0123456,"CR7GOAT");
        Passenger passenger2 = new Passenger("Messi",809090,"P5SSI");
        Passenger passenger3 = new Passenger("Nick Tron",00112233,"L0L1230");

//§§§§§§§§§§§§§§§§§§§§§§§§§§§§§ Scanner Input §§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Scanner scanner = new Scanner(System.in);

        // identifiers for Flight§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        Flight flight1 = new Flight ("Qatar airways", "QTR1231", "1234", currentDate);
        Flight flight2 = new Flight ("Singapore Airplines", "SG8800", "1069", currentDate);
        Flight flight3 = new Flight ("Air India", "IND6900", "9687", currentDate);
        Flight flight4 = new Flight ("Japan Airways", "JPN1200", "0316", currentDate);



        // Input init§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
        System.out.println("§§§§§§§§§§§§§§§ Welcome to the SUIII air §§§§§§§§§§§§§§§");
        Runner.optionMenu();

        Integer appInput = scanner.nextInt();

        //§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§


        while (appInput != 10){
            Runner.option1(appInput);
            Runner.optionMenu();
            appInput = scanner.nextInt();
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
        if (appInput == 1){
            Airport.displayFlight();
        } else if (appInput == 2) {
            Airport.displayPassenger();
        } else if (appInput == 3) {
            Passenger newPassenger = new Passenger();
            System.out.println("To add a new passenger, type the name of the passenger:");
            String name = scanner.nextLine();
            newPassenger.setName(name);

            System.out.println("type the phone number of the passenger:");
            int contactNumber = scanner.nextInt();
            newPassenger.setContactInfo(contactNumber);

            System.out.println("type the id of the passenger:");
            String passID = scanner.nextLine();
            newPassenger.setId(passID);

            Runner.addPassenger(newPassenger);

        }
    }
}



