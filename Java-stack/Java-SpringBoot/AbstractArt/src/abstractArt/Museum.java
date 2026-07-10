package abstractArt;

import java.util.ArrayList;

public class Museum {
	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<>();
	
	museum.add(new Painting(
			"Starry Night",
                "Vincent van Gogh",
                "A famous night landscape.",
                "Oil"));
	museum.add(new Painting(
                "The Persistence of Memory",
                "Salvador Dali",
                "Melting clocks in a dreamlike scene.",
                "Oil"));

        museum.add(new Painting(
                "Water Lilies",
                "Claude Monet",
                "Beautiful water lily paintings.",
                "Watercolor"));

        // Create 2 Sculptures
        museum.add(new Sculpture(
                "David",
                "Michelangelo",
                "A Renaissance masterpiece.",
                "Marble"));

        museum.add(new Sculpture(
                "The Thinker",
                "Auguste Rodin",
                "A sculpture representing deep thought.",
                "Bronze"));

        // Display all artwork
        for (Art art : museum) {
            art.viewArt();
        }
    }
}
