import java.util.Scanner;

public class JokeApp {
    private static JokeGenerator jokeGenerator = new JokeGenerator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le générateur de blagues !");
        boolean running = true;

        while (running) {
            System.out.println("Choisissez une catégorie de blagues :");
            for (JokeCategory category : JokeCategory.values()) {
                System.out.println("- " + category.name());
            }
            System.out.print("Votre choix (ou 'exit' pour quitter) : ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                running = false;
            } else {
                try {
                    JokeCategory category = JokeCategory.valueOf(input);
                    System.out.println(jokeGenerator.generateJoke(category));
                } catch (IllegalArgumentException e) {
                    System.out.println("Catégorie non reconnue. Veuillez réessayer.");
                }
            }
        }

        System.out.println("Merci d'avoir utilisé le générateur de blagues !");
        scanner.close();
    }
}
