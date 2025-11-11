public abstract class Payment {
    protected double amount;
    protected String paymentId;
    protected String date;

    public abstract boolean processPayment();
    public abstract String getPaymentDetails();
    public abstract double calculateFee();

    public Payment(double amount, String paymentId, String date){
        this.amount = amount;
        this.paymentId = paymentId;
        this.date = date;
    }
    public boolean ProcessPayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ProcessPayment'");
    }
}
