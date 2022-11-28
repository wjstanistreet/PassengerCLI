package passenger;

import airport.Airport;

public class Passenger extends Airport{

    private String name;
    private int contactInfo;
    private String id;

    public Passenger(String name, int contactInfo, String id){
        this.name = name;
        this.contactInfo = contactInfo;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
