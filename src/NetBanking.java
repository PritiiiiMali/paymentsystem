class NetBankingPayment
        extends PaymentMethod {

    public NetBankingPayment(String customerName) {
        super(customerName);
    }

    @Override
    public void processPayment(Payment payment) {

        validatePayment(payment);

        System.out.println(
                "Processing Net Banking Payment");

        payment.setStatus(
                PaymentStatus.SUCCESS);
    }
}