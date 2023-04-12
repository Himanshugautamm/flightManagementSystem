public class Address extends Passenger
{
    private  String street,state,city;

    public Address(String street, String city, String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
    }
    public String getStreet() {return street;}
    public void setStreet(String street) {this.street=street;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city=city;}

    public String getState() {return state;}
    public void setState(String state) {this.state=state;}

    void updateAddressDetails(String addressDetails)
    {
        String[] parts = addressDetails.split(",");
        if(parts.length ==3)
        {
            this.street =parts[0];
            this.city = parts[1];
            this.state = parts[2];
        }
    }
}
