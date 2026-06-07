class Payment {

    private int paymentId;
    private double amount;
    private PaymentStatus status;
    private PaymentType paymentType;

    public Payment(int paymentId,
                   double amount,
                   PaymentType paymentType) {

        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentType = paymentType;
        this.status = PaymentStatus.PENDING;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
}