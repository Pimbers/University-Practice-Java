public class CryptocurrencyPayment extends Payment {
    private String walletAddress;

    public CryptocurrencyPayment(String walletAddress, double amount, String paymentId, String date){
        super(amount, paymentId, date);
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean processPayment(){
        System.out.println("Validating cryptocurrency wallet address:" + walletAddress);
        System.out.println("Processing payment...");
        return true;
    }

    @Override
    public double calculateFee(){
        return amount * 0.01;
    }

    @Override
    public String getPaymentDetails(){
        return "Cryptocurrency Payment [ID=" + paymentId + ", Amount=£" + amount + ", Date=" + date + "]";
    }
}
