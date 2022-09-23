package hotel;

import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

// import org.json.JSONArray;
import org.json.JSONObject;

public class EnsuiteRoom extends Room {

    //private List<Booking> bookings = new ArrayList<Booking>();

    public Booking book(LocalDate arrival, LocalDate departure) {
       return super.book(arrival, departure);
    }

    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        json.put("type", "ensuite");
        return json;
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to your beautiful ensuite room which overlooks the Sydney harbour. Enjoy your stay");
    }
    
}