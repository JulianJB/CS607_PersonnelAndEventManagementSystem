class Waiter extends Person {

    // Attributes of a waiter
    int staffNumber;
    String waitingService[];
    boolean clockedin;
    int workingHours;
    double balance;

    Waiter() {
        clockedin = false;
    }

    void clockIn() {
        clockedin = true;
    }

    void collectSalary() {
        System.out.println("Employee balance is: " + balance);
        System.out.println("Balance withdrawn");
        balance = 0.0;
    }
}