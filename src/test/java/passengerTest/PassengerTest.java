package passengerTest;
import passenger.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @BeforeEach
    public void setup(){
        passenger1 = new Passenger("Ronaldo","Penaldo@gmail.com","CR7GOAT");
    }

    @Test
    //Uni
    public void name(){
        String expected = "Ronaldo";

        String actual = passenger1.getName();

        assertEquals(expected,actual);
    }

    @Test
    public void contactInfo(){
        String expected = "Penaldo@gmail.com";

        String actual = passenger1.getContactInfo();

        assertEquals(expected,actual);
    }

    @Test
    public void passengerID(){

        String expected = "CR7GOAT";

        String actual = passenger1.getId();

        assertEquals(expected,actual);
    }
}
