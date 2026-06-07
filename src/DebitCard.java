class DebitCardPayment
        extends PaymentMethod {

    public DebitCardPayment(String customerName) {
        super(customerName);
    }

    @Override
    public void processPayment(Payment payment) {

        validatePayment(payment);

        System.out.println(
                "Processing Debit Card Payment");

        payment.setStatus(
                PaymentStatus.SUCCESS);
    }
}