public class Source
{
    public static void main(String[] args) {
    Passenger passenger = new Passenger("123 Main St", "Anytown", "CA", "John Doe", "555-1234", "johndoe@example.com");
    Ticket ticket = new Ticket(1332,"Chandigarh express",1313,13);
    String addressDetails = passenger.getAddressDetails();
    String contactDetails = passenger.getContactDetails();
        System.out.println(addressDetails);
        System.out.println(contactDetails);
    }
}
