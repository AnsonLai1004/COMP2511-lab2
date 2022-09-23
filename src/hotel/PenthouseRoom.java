package hotel;

import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

// import org.json.JSONArray;
import org.json.JSONObject;

public class PenthouseRoom extends Room {

    // private List<Booking> bookings = new ArrayList<Booking>();

    public Booking book(LocalDate arrival, LocalDate departure) {
        return super.book(arrival, departure);
    }

    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        json.put("type", "penthouse");
        return json;
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to your penthouse apartment, complete with ensuite, lounge, kitchen and master bedroom.");
    }
    
}