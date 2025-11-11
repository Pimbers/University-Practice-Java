public class PayPalPayment extends Payment {
    String email;

    public PayPalPayment(String email, double amount, String paymentId, String date){
        super(amount, paymentId, date);
        this.email = email;
    }

    @Override
    public boolean processPayment(){
        System.out.println("Validating PayPal account email:" + email);
        System.out.println("Processing payment...");
        return true;
    }

    @Override
    public double calculateFee(){
        return amount * 0.03;
    }

    @Override
    public String getPaymentDetails(){
        return "PayPal Payment [ID=" + paymentId + ", Amount=£" + amount + ", Date=" + date + "]";
    }
}
