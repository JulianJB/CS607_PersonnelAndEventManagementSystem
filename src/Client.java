class Client extends Person {

    // Attributes of a client
    String email;

    Client(String name, String address, int telephoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    void hireCatering(String eventType, String date, String staffRequired, Client client) {
        EventManager eventManager = new EventManager();
        eventManager.getEventDetails(eventType, date, staffRequired, client);
    }

    void payCatering() {
        System.out.println("Service costs paid");
        //eventmanager.balance += 100 * 8;
    }

    @Override
    public String toString() {
        return "Name: " + name + " \nAddress: " + address
                + " \nPhoneNumber: " + telephoneNumber
                + " \nEmail: " + email;
    }
}