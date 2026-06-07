abstract class PaymentMethod
        implements PaymentProcessor {

    protected String customerName;

    public PaymentMethod(String customerName) {
        this.customerName = customerName;
    }

    public boolean validatePayment(Payment payment) {

        if (payment.getAmount() <= 0) {
            System.out.println("Invalid Amount");
            return false;
        }

        return true;
    }
}