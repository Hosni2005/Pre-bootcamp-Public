package Map;
import java.util.HashMap;

public class Songs {
	public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Starlight", "Our hopes and expectations...");
        trackList.put("Hysteria", "It's bugging me...");
        trackList.put("Uprising", "They will not force us...");
        trackList.put("Madness", "I have finally seen the light...");

        String lyrics = trackList.get("Hysteria");
        System.out.println("Lyrics for Hysteria:");
        System.out.println(lyrics);

        System.out.println("\nAll Tracks:");

        for (String track : trackList.keySet()) {
            System.out.println(track + ": " + trackList.get(track));
        }
    }
}
