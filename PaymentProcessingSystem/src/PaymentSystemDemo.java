public class PaymentSystemDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment p1 = new CreditCardPayment("CC001", 100, "2025-11-10", "4111-1111-1111-1111");
        Payment p2 = new PayPalPayment("PP001", 50, "2025-11-10", "user@example.com");
        Payment p3 = new CryptocurrencyPayment("CR001", 200, "2025-11-10", "0xABCDEF123456");
        Payment p4 = new CashPayment(75, "CA001", "2025-11-10");

        processor.addPayment(p1);
        processor.addPayment(p2);
        processor.addPayment(p3);
        processor.addPayment(p4);

        processor.processAllPayments();
    }
}
