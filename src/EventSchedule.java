import java.util.ArrayList;

class EventSchedule {

    ArrayList<Event> eventList;

    EventSchedule() {
        eventList = new ArrayList<Event>();
    }

    Event getEvent(int eventId) {
        return eventList.get(eventId);
    }

    void printEventSchedule() {
        for (Event event : eventList) {
            System.out.println(event + "\n");
        }
    }

    void cancelEvent(Event event) {}

    void modifyEvent(Event event) {}

    void assignRoles(Event event) {}
}