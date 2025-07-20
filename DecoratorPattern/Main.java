public class Main {
    public static void main(String[] args) {
        // Base Notifier (Email only)
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS functionality
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack functionality on top of Email + SMS
        Notifier fullNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Send notification via Email, SMS, and Slack
        fullNotifier.send("System maintenance scheduled at 10 PM tonight.");
    }
}
