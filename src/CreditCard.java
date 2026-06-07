class CreditCardPayment
        extends PaymentMethod {

    public CreditCardPayment(String customerName) {
        super(customerName);
    }

    @Override
    public void processPayment(Payment payment) {

        validatePayment(payment);

        System.out.println(
                "Processing Credit Card Payment");

        payment.setStatus(
                PaymentStatus.SUCCESS);
    }
}
