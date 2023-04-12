public class TouristTicket extends Ticket
{
  private   String hotelAddress,airlinesName;
  private String selectedTouristLocation;
  private  int flightNumber,bookedSeats,capacity;

    public TouristTicket(int flightNumber, String airlinesName, int capacity, int bookedSeats, String hotelAddress, String selectedTouristLocation)
    {
        super(flightNumber, airlinesName, capacity, bookedSeats);
        this.hotelAddress =hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;
    }
  public int getFlightNumber() {return flightNumber;}
  public void setFlightNumber(int flightNumber){this.flightNumber=flightNumber;}


  public String getAirlineName(){return airlinesName;}
  public void setAirlinesName(String airlinesName){this.airlinesName=airlinesName;}

  public int getCapacity() {return capacity;}
  public void setCapacity(int capacity){this.capacity=capacity;}

  public int getBookedSeats() {return bookedSeats;}
  public void setBookseats(int bookedSeats){this.bookedSeats=bookedSeats;}


  public String getHotelAddress() {
    return hotelAddress;
  }

  public void setHotelAddress(String hotelAddress) {
    this.hotelAddress = hotelAddress;
  }
  public String getSelectedTouristLocation() {return selectedTouristLocation;}
  public void setSelectedTouristLocation(String selectedTouristLocation){this.selectedTouristLocation=selectedTouristLocation;}


}
