package Exercise;

public class TestShiritori {
    public static void main(String[] args) {
        Shiritori game = new Shiritori();

        System.out.println(game.play("apple"));
        System.out.println(game.play("ear"));
        System.out.println(game.play("rhino"));
        System.out.println(game.play("corn"));

        System.out.println(game.getWords());

        System.out.println(game.restart());
        System.out.println(game.getWords());

        System.out.println(game.play("hostess"));
        System.out.println(game.play("stash"));
        System.out.println(game.play("hostess"));
    }
}
