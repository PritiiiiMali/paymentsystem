class PaymentIdGenerator {

    private static int id = 1000;

    public static int generateId() {
        return ++id;
    }
}