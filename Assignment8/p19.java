import java.util.ArrayList;

class Reservations{
    ArrayList<Hotel> hotelBookings = new ArrayList<Hotel>();

    ArrayList<Flight> flightBookings = new ArrayList<Flight>();

    public void BookHotel(Hotel h){
        hotelBookings.add(h);
        System.out.println("Flight "+ h.getName() + " booked successfully");

    }

    public void cancelHotel(Hotel h){
        hotelBookings.remove(h);
        System.out.println("Hotel "+ h.getName() + " canceled successfully");

    }

    public void bookFlight(Flight f){
        flightBookings.add(f);
        System.out.println("Flight "+ f.getName() + " booked successfully");

    }

    public void cancelFlight(Flight f){
        flightBookings.remove(f);
        System.out.println("Flight "+ f.getName() + " canceled successfully");
    }

    public void searchFlightBooking(String keyword){
        keyword = keyword.toLowerCase();
        boolean flag = false;

        for(Flight f : flightBookings){
            if(f.getName().equals(keyword) || f.getfromCity().equals(keyword) || f.getDestination().equals(keyword) || f.getDate().equals(keyword)){
                System.out.println("------------Following result found :--------------");
                f.flightDetails();
                flag = true;
            }
        }

        if(!flag) System.out.println("No booking found...");
    }

    public void searchHotelBooking(String keyword){
        keyword = keyword.toLowerCase();
        boolean flag = false;

        for(Hotel h : hotelBookings){
            if(h.getName().equals(keyword) || h.getCity().equals(keyword) || h.getDate().equals(keyword)){
                System.out.println("------------Following is the result found :------------");
                h.hotelDetails();
                flag = true;
            }
        }

        if(!flag) System.out.println("No booking found...");
    }

    public void displayAllBookings(){

        System.out.println("------All bookings and reservations-------");

        for(Hotel hotel : hotelBookings)
        hotel.hotelDetails();

        for(Flight flight : flightBookings)
        flight.flightDetails();
    }

}

class Hotel{
    private String city;
    private String name;
    private String date;

    public Hotel(){}

    public Hotel(String name, String city, String date){
        this.city = city.toLowerCase();
        this.name = name.toLowerCase();
        this.date = date.toLowerCase();
    }

    public void setDate(String date){
        this.date = date.toLowerCase();
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public String getDate(){
        return date;
    }

    public void hotelDetails(){
        System.out.println("Hotel : " + name + "\t City : " + city + "\t Date : " + date);
    }
}

class Flight{
    private String fromCity;
    private String destination;
    private String name;
    private String date;

    public Flight(){}

    public Flight(String name, String fromCity, String destination, String date){
        this.fromCity = fromCity.toLowerCase();
        this.destination = destination.toLowerCase();
        this.name = name.toLowerCase();
        this.date = date.toLowerCase();
    }

    public void setDate(String date){
        this.date = date.toLowerCase();
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getName(){
        return name;
    }

    public String getfromCity(){
        return fromCity;
    }

    public String getDestination(){
        return destination;
    }

    public String getDate(){
        return date;
    }

    public void flightDetails(){
        System.out.println("Flight : " + name + "\t City : " + fromCity + "\t Destination : " + destination + "\t Date : " + date);
    }
}

class Test{
    public static void main(String args[]){
        Flight f1 = new Flight("Air india", "Indore", "Dubai", "12/12/2025");
        Hotel h1 = new Hotel("Burj-khalifa", "Dubai", "12/12/2025");
        Reservations res = new Reservations();

        // f1.flightDetails();
        // h1.hotelDetails();

        res.bookFlight(f1);
        res.BookHotel(h1);
        res.displayAllBookings();
        res.searchFlightBooking("Bhopal");
        res.searchHotelBooking("12/12/2025");
    }
}