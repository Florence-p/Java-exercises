package Exercise;


import java.util.ArrayList;
import java.util.Scanner;

public class ShiritoriGame {
    private ArrayList<String> words;
    private boolean game_over;

    public ShiritoriGame() {
        words = new ArrayList<>();
        game_over = false;
    }

    public boolean play(String word) {
        if (game_over) {
            return false;
        }

        if (words.contains(word)) {
            game_over = true;
            return false;
        }

        if (!words.isEmpty()) {
            String lastWord = words.get(words.size() - 1);
            char lastChar = lastWord.charAt(lastWord.length() - 1);
            char firstChar = word.charAt(0);

            if (lastChar != firstChar) {
                game_over = true;
                return false;
            }
        }

        words.add(word);
        return true;
    }

    public void restart() {
        words.clear();
        game_over = false;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public boolean isGameOver() {
        return game_over;
    }

}