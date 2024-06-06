import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeDatabase {
    private List<Joke> jokes;

    public JokeDatabase() {
        jokes = new ArrayList<>();
        populateJokes();
    }

    private void populateJokes() {
        jokes.add(new Joke("Pourquoi les plongeurs plongent-ils toujours en arrière ? Parce que sinon ils tombent dans le bateau.", JokeCategory.GENERAL));
        jokes.add(new Joke("Que dit une imprimante dans l’eau ? J’ai papier !", JokeCategory.TECH));
        jokes.add(new Joke("Pourquoi les éléphants ne bronzent-ils pas ? Parce qu’ils sont déjà gris.", JokeCategory.ANIMAL));
        jokes.add(new Joke("Pourquoi les poissons détestent l’ordinateur ? À cause de la souris.", JokeCategory.TECH));
        jokes.add(new Joke("Quel est le comble pour un prof de maths ? De perdre son latin.", JokeCategory.SCHOOL));
        jokes.add(new Joke("Pourquoi les oiseaux ne prennent-ils pas de médicaments ? Parce qu’ils préfèrent les tweets.", JokeCategory.TECH));
        jokes.add(new Joke("Pourquoi les poules aiment-elles les ordinateurs ? Parce qu’elles adorent les clics.", JokeCategory.ANIMAL));
        jokes.add(new Joke("Quel est le sport préféré des poissons ? Le water-polo.", JokeCategory.SPORTS));
        jokes.add(new Joke("Pourquoi les canards sont toujours à l'heure ? Parce qu'ils sont dans l'étang.", JokeCategory.ANIMAL));
        jokes.add(new Joke("Quelle est la meilleure saison pour les chats ? L'été, parce qu'ils peuvent ronronner au soleil.", JokeCategory.ANIMAL));
        jokes.add(new Joke("Quel est le fruit le plus sympathique ? La banane, parce qu’elle se pèle bien.", JokeCategory.FOOD));
        jokes.add(new Joke("Pourquoi les vaches regardent-elles les trains passer ? Parce qu'elles ruminent sur le sens de la vie.", JokeCategory.ANIMAL));
        jokes.add(new Joke("Quel est le comble pour un jardinier ? C’est de raconter des salades.", JokeCategory.GENERAL));
        jokes.add(new Joke("Pourquoi les autruches ne volent-elles pas ? Parce qu'elles ont peur de se planter.", JokeCategory.ANIMAL));
        jokes.add(new Joke("Pourquoi les vampires ne bronzent-ils pas ? Parce qu’ils sont dans les tombes.", JokeCategory.GENERAL));
        jokes.add(new Joke("Quel est le comble pour un plombier ? De ne pas pouvoir colmater les fuites.", JokeCategory.GENERAL));
        jokes.add(new Joke("Pourquoi les oiseaux ne téléphonent-ils jamais ? Parce qu'ils préfèrent tweeter.", JokeCategory.TECH));
        jokes.add(new Joke("Quel est le comble pour un électricien ? De ne pas être branché.", JokeCategory.TECH));
        jokes.add(new Joke("Pourquoi les ordinateurs n'aiment-ils pas les araignées ? Parce qu'elles leurs tissent des bugs.", JokeCategory.TECH));
        // Ajoutez autant de blagues que vous le souhaitez ici...
    }

    public List<Joke> getJokesByCategory(JokeCategory category) {
        List<Joke> jokesByCategory = new ArrayList<>();
        for (Joke joke : jokes) {
            if (joke.getCategory() == category) {
                jokesByCategory.add(joke);
            }
        }
        return jokesByCategory;
    }

    public Joke getRandomJoke(JokeCategory category) {
        List<Joke> jokesByCategory = getJokesByCategory(category);
        Random rand = new Random();
        return jokesByCategory.get(rand.nextInt(jokesByCategory.size()));
    }
}
