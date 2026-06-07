class UpiPayment
        extends PaymentMethod {

    public UpiPayment(String customerName) {
        super(customerName);
    }

    @Override
    public void processPayment(Payment payment) {

        validatePayment(payment);

        System.out.println(
                "Processing UPI Payment");

        payment.setStatus(
                PaymentStatus.SUCCESS);
    }
}