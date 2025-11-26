package Exercise;


import java.util.ArrayList;

public class Shiritori {
    private ArrayList<String> words;
    private boolean game_over;


    public Shiritori() {
        words = new ArrayList<>();
        game_over = false;
    }

    public Object play(String word) {
        if (game_over) {
            return "game over";
        }
        if (!words.isEmpty()) {
            String lastword = words.get(words.size() - 1);
            char lastChar = lastword.charAt(lastword.length() - 1);
            char firstChar = word.charAt(0);

            if (lastChar != firstChar) {
                game_over = true;
                return "game over";
            }
        }
        words.add(word);
        return words;
    }

    public String restart() {
        words.clear();
        game_over = false;
        return "game  restarted";
    }

    public ArrayList<String> getWords() {
        return words;

    }
}