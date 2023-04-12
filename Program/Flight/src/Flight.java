abstract public class Flight
{
    private  String airlines;
    private int flightNumber,capacity,bookedSeats;

    public Flight(int flightNumber, String airlines,int capacity, int bookedSeats)
    {
        this.flightNumber = flightNumber;
        this.airlines =airlines;
        this.capacity =capacity;
        this.bookedSeats=0;
    }
    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAirlineName() {return airlines;}

    public int getCapacity() {return capacity;}

    public int getBookedSeats() {return bookedSeats;}

    public void setBookedSeats(int bookedSeats){this.bookedSeats =bookedSeats;}
    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airlines+
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    public boolean checkAvailability()
    {
        return bookedSeats<capacity;
    }
    public void incrementBookingCounter() {
        bookedSeats++;
    }}
