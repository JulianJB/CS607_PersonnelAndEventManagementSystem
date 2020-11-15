class EMSRunner {

    public static void main(String[] args) {
        // Test A
        Client clientA = new Client("Barbie Palvin", "Budapest",
                357123, "hello@barbie");
        clientA.hireCatering("Party", "25-12-2020", "2 food waiters", clientA);
    }
}