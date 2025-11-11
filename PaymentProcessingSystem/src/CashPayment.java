public class CashPayment extends Payment {

    public CashPayment(double amount, String paymentId, String date){
        super(amount, paymentId, date);
    }

    @Override
    public boolean processPayment(){
        System.out.println("Verifying in person confirmation");
        System.out.println("Processing payment...");
        return true;
    }

    public double calculateFee(){
        return amount;
    }

    public String getPaymentDetails(){
        return "In Person Payment [ID = " + paymentId + ", Amount =£" + amount + ", Date" + date + "]";  
    }
}
