package Puzzle;
import java.util.ArrayList;

public class TestPuzzleJava {
	public static void main(String[] args) {

        PuzzleJava generator = new PuzzleJava();
        // Write your other test cases here.
        
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Ten Rolls:");
        System.out.println(randomRolls);

        System.out.println("\nRandom Letter:");
        System.out.println(generator.getRandomLetter());

        System.out.println("\nRandom Password:");
        System.out.println(generator.generatePassword());

        System.out.println("\nPassword Set:");
        System.out.println(generator.getNewPasswordSet(5));

        ArrayList<Object> testArray = new ArrayList<>();

        testArray.add("Batman");
        testArray.add("Robin");
        testArray.add("Alfred");
        testArray.add("Joker");
        testArray.add("Catwoman");

        System.out.println("\nShuffled Array:");
        generator.shuffleArray(testArray);
    }
}
