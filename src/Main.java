public class Main {

    public static void main(String[] args) {

        Payment payment =
                new Payment(
                        PaymentIdGenerator.generateId(),
                        5000,
                        PaymentType.UPI
                );

        PaymentProcessor processor =
                new UpiPayment("Om");

        processor.processPayment(payment);

        System.out.println();

        System.out.println(
                "Payment Id : "
                        + payment.getPaymentId());

        System.out.println(
                "Amount : "
                        + payment.getAmount());

        System.out.println(
                "Status : "
                        + payment.getStatus());

        System.out.println(
                "Type : "
                        + payment.getPaymentType());
    }
}