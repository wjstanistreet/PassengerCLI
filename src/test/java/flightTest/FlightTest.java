package flightTest;

import flight.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;







public class FlightTest {
    Flight flight1;
      Date currentDate = new Date();

         @BeforeEach

         public void setup(){


                           flight1 = new Flight ("Qatar airways", "QTR1231", "1234", currentDate);



         }

             @Test

             //name of flight
             public void nameOfFlight(){

                 String expected = "Qatar airways";

                 String actual = flight1.getName();

                 assertEquals(expected,actual);
             }

             // testing planeId


             @Test

             //name of flight
             public void id(){

                 String expected = "QTR1231";

//                 Flight flight1;
                 String actual = flight1.getId();

                 assertEquals(expected,actual);
             }



             @Test

            public void planeId(){

            String expected = "1234";
            String actual = flight1.getPlaneId();

                          }




}
