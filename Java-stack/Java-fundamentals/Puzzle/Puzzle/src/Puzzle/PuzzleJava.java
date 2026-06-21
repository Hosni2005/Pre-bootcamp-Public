package Puzzle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
	Random rand = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(20) + 1);
        }

        return rolls;
    }

    public char getRandomLetter() {
        char[] alphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z'
        };

        int randomIndex = rand.nextInt(26);

        return alphabet[randomIndex];
    }

    public String generatePassword() {
        String password = "";

        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }

        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwords = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            passwords.add(generatePassword());
        }

        return passwords;
    }

    public void shuffleArray(ArrayList<Object> list) {
        Collections.shuffle(list);

        System.out.println(list);
    }
}
