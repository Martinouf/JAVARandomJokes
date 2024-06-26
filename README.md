# Générateur de Blagues en Java

Bienvenue dans le projet **Générateur de Blagues en Java** ! Ce projet est une application Java console qui permet de générer des blagues aléatoires classées par catégories. Vous pouvez choisir parmi plusieurs catégories de blagues et obtenir une blague aléatoire correspondante.

## Fonctionnalités

- **Blagues Classées** : Les blagues sont classées en différentes catégories telles que ANIMAL, TECH, SCHOOL, GENERAL, FOOD, et SPORTS.
- **Génération Aléatoire** : Une blague aléatoire est générée à partir de la catégorie sélectionnée.
- **Interface Console** : Interface utilisateur simple en ligne de commande pour une utilisation facile.

## Structure du Projet

Le projet est divisé en plusieurs fichiers Java :

1. **Joke.java** : Représente une blague.
2. **JokeCategory.java** : Enum pour les catégories de blagues.
3. **JokeDatabase.java** : Contient une base de données de blagues classées par catégorie.
4. **JokeGenerator.java** : Génère une blague aléatoire en fonction de la catégorie.
5. **JokeApp.java** : Classe principale avec l'interface utilisateur en console.

## Installation et Compilation

### Prérequis

- Java Development Kit (JDK) installé sur votre machine.

### Étapes

1. Clonez le dépôt ou téléchargez les fichiers du projet.
2. Ouvrez un terminal et naviguez jusqu'au dossier du projet.
3. Compilez les fichiers Java avec la commande suivante :

   ```sh
   javac *.java

   java JokeApp

## Utilisation

1. Après avoir démarré l'application, vous verrez une liste de catégories de blagues.
2. Tapez le nom de la catégorie souhaitée (par exemple, `ANIMAL`, `TECH`, `SCHOOL`, `GENERAL`, `FOOD`, `SPORTS`) et appuyez sur Entrée.
3. Une blague aléatoire de la catégorie sélectionnée sera affichée.
4. Pour quitter l'application, tapez `exit` et appuyez sur Entrée.

## Exemple

    ```sh
    Bienvenue dans le générateur de blagues !
    Choisissez une catégorie de blagues :
    - ANIMAL
    - TECH
    - SCHOOL
    - GENERAL
    - FOOD
    - SPORTS
    Votre choix (ou 'exit' pour quitter) : TECH
    Que dit une imprimante dans l’eau ? J’ai papier !
    Votre choix (ou 'exit' pour quitter) : exit
    Merci d'avoir utilisé le générateur de blagues !

---

Amusez-vous bien avec le générateur de blagues ! 😊
