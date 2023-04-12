class RegularTicket extends Ticket
{
    private String specialServices,airlinesName;;
    private int flightNumber,capacity,bookSeats;
    public RegularTicket(int flightNumber, String airlines, int capacity, int bookSeats, String specialServices)
    {
        super(flightNumber,airlines,capacity,bookSeats);
        this.specialServices =specialServices;
    }
     public String getFlightDetails()
    {
        return "Flight Number:" + getFlightNumber() + ",Airlines name:"+ getAirlineName() +",capacity" + getCapacity() + ",Booked Seats:" + getBookedSeats()+", Speacial Services" + specialServices;
    }

    public int getFlightNumber() {return flightNumber;}
    public void setFlightNumber(int flightNumber){this.flightNumber=flightNumber;}

    public String getAirlineName(){return airlinesName;}
    public void setAirlinesName(String airlinesName){this.airlinesName=airlinesName;}

    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity){this.capacity=capacity;}

    public int getBookedSeats() {return bookSeats;}
    public void setBookSeats(int bookSeats){this.bookSeats=bookSeats;}

    public String getSpecialServices() {return specialServices;}
    public void setSpecialServices(String specialServices){this.specialServices=specialServices;}


    String updateSpecialServices(String Services)
    {
    return specialServices;
    }

}
