import java.util.ArrayList;

class EventManager extends Waiter {

    // Attributes of an event manager
    EventSchedule eventSchedule;
    ArrayList<Waiter> staffList;

    EventManager() {
        eventSchedule = new EventSchedule();
        staffList = new ArrayList<Waiter>();
    }

    void checkAttendance() {
        for (Waiter waiter : staffList) {
            if (waiter.clockedin == true) {
                checkOvertime(waiter);
                paySalary(waiter);
            }
        }
    }

    void paySalary(Waiter waiter) {
        System.out.println("Salary paid to: " + waiter.name);
        waiter.balance += 100 * 8;
    }

    void checkOvertime(Waiter employee) {
        if (employee.workingHours > 8) {
            employee.balance += 150 * (workingHours - 8);
        }
    }

    void getEventDetails(String eventType, String date, String staffRequired, Client client) {
        Event event = new Event(eventType, date, client);
        scheduleEvent(event);
    }

    void scheduleEvent(Event event) {
        eventSchedule.eventList.add(event);
    }

    void cancelEvent(int eventId) {
        System.out.println("Event: " + eventId + " cancelled");
        Event event = eventSchedule.eventList.get(eventId);
        eventSchedule.eventList.remove(event);
    }

    void modifyEvent(int eventId) {
        System.out.println("Event: " + eventId + " updated");
        Event event = eventSchedule.eventList.get(eventId);
        eventSchedule.eventList.remove(event);
    }

    void assignRoles(int eventId, int[] idx_employee) {
        Event event = eventSchedule.eventList.get(eventId);
        event.waiterList.clear();
        for (int index : idx_employee) {
            event.waiterList.add(staffList.get(index));
        }
    }
}