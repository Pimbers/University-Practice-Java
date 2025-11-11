public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber, double amount, String paymentId, String date){
        super(amount, paymentId, date);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(){
        System.out.println("Validating credit card number:" + cardNumber);
        System.out.println("Processing payment...");
        return true;
    }

    @Override
    public double calculateFee(){
        return amount * 0.025;
    }

    @Override
    public String getPaymentDetails(){
        return "Credit Card Payment [ID=" + paymentId + ", Amount=£" + amount + ", Date=" + date + "]";
    }
}
