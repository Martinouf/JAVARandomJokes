public class JokeGenerator {
    private JokeDatabase jokeDatabase;

    public JokeGenerator() {
        jokeDatabase = new JokeDatabase();
    }

    public String generateJoke(JokeCategory category) {
        Joke joke = jokeDatabase.getRandomJoke(category);
        return joke.toString();
    }
}
