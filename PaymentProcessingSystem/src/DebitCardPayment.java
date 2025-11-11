public class DebitCardPayment extends Payment{
    private int pin;
    
    public DebitCardPayment(int pin, double amount, String paymentId, String date){
        super(amount, paymentId, date);
        this.pin = pin;
    }

    @Override
    public boolean processPayment(){
        System.out.println("Validating debit card PIN:" + pin);
        System.out.println("Processing payment...");
        return true;
    }

    @Override
    public double calculateFee(){
        return amount * 0.015;
    }

    @Override
    public String getPaymentDetails(){
        return "Debit Card Payment [ID=" + paymentId + ", Amount=£" + amount + ", Date=" + date + "]";
    }
}
