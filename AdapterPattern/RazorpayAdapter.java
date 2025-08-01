public class RazorpayAdapter implements PaymentProcessor {
    private RazorpayGateway razorpay;

    public RazorpayAdapter() {
        this.razorpay = new RazorpayGateway();
    }

    @Override
    public void processPayment(double amount) {
        razorpay.doTransaction(amount);
    }
}
