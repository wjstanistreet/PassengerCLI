package passenger;

import airport.Airport;
import interfacesPackage.ISum;

public class Passenger {

    private String name;
    private String contactInfo;
    private String id;

    public Passenger(String name, String contactInfo, String id){
        this.name = name;
        this.contactInfo = contactInfo;
        this.id = id;
    }

    public Passenger(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
