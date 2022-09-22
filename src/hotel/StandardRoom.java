package hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class StandardRoom extends Room {

    private List<Booking> bookings = new ArrayList<Booking>();

    public Booking book(LocalDate arrival, LocalDate departure) {
        for (Booking booking : bookings) {
            if (booking.overlaps(arrival, departure)) {
                return null;
            }
        }

        Booking booking = new Booking(arrival, departure);
        bookings.add(booking);
        return booking;
    }

    public JSONObject toJSON() {
        JSONArray bookingsArr = new JSONArray();
        for (Booking booking : bookings) {
            bookingsArr.put(booking.toJSON());
        }
        JSONObject json = new JSONObject();
        json.put("type", "standard");
        json.put("bookings", bookingsArr);
        return json;
    }
    
    public void printWelcomeMessage() {
        System.out.println("Welcome to your standard room. Enjoy your stay :)");
    }

}