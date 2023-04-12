public class Passenger
{
    private static int idCounter =0;
    private int id;
    private Address address;
    private Contact contact;

    public Passenger(String street, String city, String state,String name, String phone, String email)
    {
        this.id = ++idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,phone,email);
    }
    public Passenger(){}
    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getAddressDetails()
    {
        return "Street: " + address.getStreet() + ", City: " + address.getCity() + ", State: " + address.getState();
    }
    public String getContactDetails()
    {
        return "Name: " + contact.getName() + ", Phone: " + contact.getPhone() + ", Email: " + contact.getEmail();

    }
    public static int getPassengerCount()
    {
        return idCounter;
    }
}
