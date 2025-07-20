public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(100.0);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(200.0);

        PaymentProcessor razorpay = new RazorpayAdapter();
        razorpay.processPayment(1500.0);
    }
}
