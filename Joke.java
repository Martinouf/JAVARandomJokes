public class Joke {
    private String text;
    private JokeCategory category;

    public Joke(String text, JokeCategory category) {
        this.text = text;
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public JokeCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return text;
    }
}
