import java.util.ArrayList;

class Event {

    // Attributes of an Event
    int eventId;
    String eventType;
    String date;
    Client client;
    ArrayList<Waiter> waiterList;

    Event(String eventType, String date, Client client) {
        // Generate random event ID
        eventId = 001;
        this.eventType = eventType;
        this.date = date;
        this.client = client;
        waiterList = new ArrayList<Waiter>();
    }

    int getEventId() {
        return eventId;
    }

    @Override
    public String toString() {
        return "The event: " + eventId + " \nEvent Type: "
                + eventType + " \nDate: " + date + " \nClient: "
                + client;
    }
}