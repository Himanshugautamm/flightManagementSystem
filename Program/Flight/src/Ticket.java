public class Ticket {
    private TouristTicket touristTicket;
    private RegularTicket regularTicket;

   public Ticket(String pnr, String from, String to, String departureDateTime,
                 String arrivalDateTime, String seatNo, float price, boolean cancelled,
                 Flight flight, Passenger passenger, int flightNumber,
                 int capacity, int bookedSeats, String hotelAddress,
                 String selectedTouristLocation, String airlinesName,
                 int bookseats, String specialServices)
   {
       this.touristTicket =new TouristTicket(flightNumber, airlinesName, capacity, bookedSeats,hotelAddress,selectedTouristLocation);
       this.regularTicket =new RegularTicket(flightNumber,airlinesName,capacity,bookseats,specialServices);
   }

    public Ticket(int flightNumber, String airlinesName, int capacity, int bookedSeats) {
    }

    public String getTicketsDetails()
    {
        return "FlightNumber: " + regularTicket.getFlightNumber() + ", airlines: " + regularTicket.getAirlineName() + ", Capacity: " +regularTicket.getCapacity() + ", Seats: " +regularTicket.getBookedSeats();
    }
}

