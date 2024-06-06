import java.util.Random;

public class RandomJoke {
    public static void main(String[] args) {
        System.out.println(getRandomJoke());
    }

    public static String getRandomJoke() {
        String[] jokes = {
            "Pourquoi les plongeurs plongent-ils toujours en arrière et jamais en avant ? Parce que sinon ils tombent dans le bateau.",
            "Que dit une imprimante dans l’eau ? J’ai papier !",
            "Quel est le comble pour un électricien ? De ne pas être au courant.",
            "Pourquoi les poissons détestent l’ordinateur ? À cause de la souris.",
            "Quelle est la femelle du hamster ? L’amsterdam.",
            "Pourquoi les éléphants ne bronzent-ils pas ? Parce qu’ils sont déjà gris.",
            "Pourquoi les oiseaux ne prennent-ils pas de médicaments ? Parce qu’ils préfèrent les tweets.",
            "Pourquoi les pompiers ne font-ils jamais de manucure ? Parce qu’ils ne veulent pas limer les ongles.",
            "Quel est le comble pour un prof de maths ? De perdre son latin.",
            "Que fait une abeille qui fait du kung-fu ? Un coup de pollen.",
            "Pourquoi les plongeurs plongent-ils en arrière ? Parce que sinon ils tombent encore dans le bateau.",
            "Pourquoi les poules aiment-elles les ordinateurs ? Parce qu’elles adorent les clics.",
            "Quel est le sport préféré des poissons ? Le water-polo.",
            "Quel est le fruit le plus sympathique ? La banane, parce qu’elle se pèle bien.",
            "Quel est le comble pour un jardinier ? C’est de raconter des salades.",
            "Pourquoi les canards sont toujours à l'heure ? Parce qu'ils sont dans l'étang.",
            "Quelle est la meilleure saison pour les chats ? L'été, parce qu'ils peuvent ronronner au soleil.",
            "Pourquoi les autruches ne volent-elles pas ? Parce qu'elles ont peur de se planter.",
            "Pourquoi les vampires ne bronzent-ils pas ? Parce qu’ils sont dans les tombes.",
            "Quel est le comble pour un plombier ? De ne pas pouvoir colmater les fuites.",
            "Pourquoi les oiseaux ne téléphonent-ils jamais ? Parce qu'ils préfèrent tweeter.",
            "Quel est le comble pour un électricien ? De ne pas être branché.",
            "Pourquoi les vaches regardent-elles les trains passer ? Parce qu'elles ruminent sur le sens de la vie.",
            "Quel est le comble pour un espion ? De se faire alpaguer par un alpagateur.",
            "Pourquoi les ordinateurs n'aiment-ils pas les araignées ? Parce qu'elles leurs tissent des bugs."
        };
        Random rand = new Random();
        return jokes[rand.nextInt(jokes.length)];
    }
}
