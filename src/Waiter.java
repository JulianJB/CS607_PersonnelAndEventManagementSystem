import java.util.ArrayList;

class Waiter extends Person {

    // Attributes of a waiter
    int staffNumber;
    String waitingService[];
    ArrayList<Event> personalSchedule;
    boolean clockedin;
    int workingHours;
    double balance;

    Waiter() {
        clockedin = false;
    }

    void clockIn() {
        clockedin = true;
    }

    void checkPersonalSchedule() {
        for (Event event : personalSchedule) {
            System.out.println(event + "\n");
        }
    }

    void collectSalary() {
        System.out.println("Employee balance is: " + balance);
        System.out.println("Balance withdrawn");
        balance = 0.0;
    }
}