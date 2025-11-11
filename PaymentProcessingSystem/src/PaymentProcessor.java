import java.util.*;

class PaymentProcessor {
    private List<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
    }
    
    public void processAllPayments() {
        double totalFees = 0.0;

        for (Payment payment : payments){
            System.out.println("--------------------------------");
            System.out.println(payment.getPaymentDetails());

            if (payment.processPayment()) {
                double fee = payment.calculateFee();
                totalFees += fee;
                System.out.println("Payment processd successfully . Fee £" + fee);
            } else {
                System.out.println("Payment failed");
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Total processing fees: $" + totalFees);
    }
}

