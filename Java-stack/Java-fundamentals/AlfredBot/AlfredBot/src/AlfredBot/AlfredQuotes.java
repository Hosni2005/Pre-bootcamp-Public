package AlfredBot;
import java.util.Date;

public class AlfredQuotes {
	public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    // Guest Greeting
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    // Date Announcement
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date + ".";
    }

    // Respond Before Alexis
    public String respondBeforeAlexis(String conversation) {

        if (conversation.indexOf("Alexis") >= 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        else if (conversation.indexOf("Alfred") >= 0) {
            return "At your service. As you wish, naturally.";
        }

        else {
            return "Right. And with that I shall retire.";
        }
    }

    // Ninja Bonus - Method Overloading
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    // Sensei Bonus
    public String angryQuote(String message) {
        return message.toUpperCase() + "!!!";
    }
}
