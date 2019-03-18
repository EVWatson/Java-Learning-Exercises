import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


//    public static void printMessage (Message sentence) {
//      System.out.println(sentence.getSentence());
//    }

    public static void printString (String sentence) {
        System.out.println(sentence);
    }

    public static String getUserName() {
        Scanner answerQuestion = new Scanner(System.in);
        String userName = answerQuestion.nextLine();
        return userName;
    }

    public static String getUserAnimalChoice () {
        Scanner makeChoice = new Scanner(System.in);
        String usersChoice = makeChoice.next();
        return usersChoice;
    }

    public static void printList (String list) {
        for (int i = 0; i <= list.length(); i ++) {
            System.out.println(list);
        }
    }

//    public static String turnInttoString (int usersChoice) {
//        int
//    }


//    public static void instruction1() {
//        System.out.println("Are you a cat or a dog person? ");
//    }

    public static void main(String[] args) {


//        Message welcomeMessage = new Message("Welcome to Adopt A Pet!");
//        Message askForUserName = new Message("What is your name?");


        printString(Message.getWelcomeMessage());
//        printString(Message.getUserNamePrompt());

        printString(Message.getAskForUserName());

        String userName = getUserName();

        printString(Message.getGreetUser(userName));

        printString(Message.getGiveAnimalOptionsMessage());

        printString(Adoption_centre.getAvailableAnimals());

        String userChoice = getUserAnimalChoice();

//        String animalChoice;
//
//        switch (animals) {
//            case 1: animalChoice = getUserAnimalChoice();
//                break;
//
//            case 2: animalChoice = getUserAnimalChoice();
//                break;
//
//                default: animalChoice = "You must choose an animal";
//                break;
//
//        }
//        printString(Message.getConfirmUserAnimalChoice(animalChoice));


        if (userChoice.equals("1")) {
            String choice = "cat";
//            display message for choice of animal
            printString(Message.getConfirmUserAnimalChoice(choice));
//            display available cats

            printString(Message.getDisplayAvailableChosenAnimals());

            List<Cat> allCats = Arrays.asList(
                    new Cat("Louie", "Domestic Short Hair", 3, "Tabby", "Meow!"),
                    new Cat( "Pepper", "Domestic Short Hair", 3, "Tortoise-Shell", "Purrrrrr"),
                    new Cat("Freddie", "Burmese", 5, "Champagne", "Meow!"),
                    new Cat("Stormy Monday", "Domestic Short Hair", 1, "Tabby", "Mreow!"),
                    new Cat("Philomena", "Domestic Short Hair", 1, "Tabby", "Mew!"));

            for (int c = 0; c < allCats.size(); c++)
                System.out.println(allCats.get(c).getCatName() + ", " + allCats.get(c).getCatBreed() + ", " + allCats.get(c). getCatColour());


//            get user choice of cat
//            check if user would like to re-name cat
        } else if (userChoice.equals("2")) {
            String choice = "dog";
            List<Dog> allDogs = Arrays.asList(
                    new Dog ("Jack", "German Shepherd X Rottweiler", 5, "Tan and black", "Woof woof!"),
                    new Dog ("Cassy", "Labrador X Cocker Spaniel", 2, "Golden", "Wuff wuff!"),
                    new Dog ("Lola", "Staffordshire Terrier", 1, "Black", "Woof!"),
                    new Dog ("Ben", "Poodle X Maltease Terrier", 8, "Brown", "Wuff!"),
                    new Dog ("Sugar", "Poodle", 4, "White", "Bow wow!")
            );
            for (int d = 0; d < allDogs.size(); d++)
                System.out.println(allDogs.get(d).getDogName() + ", " + allDogs.get(d).getDogBreed() + ", " + allDogs.get(d).getDogColour());
        }


//            options for dogs
    }








//        allCats.add(louie);
//        allCats.add(pepper);



//        int i = 0;
//        while(i<allCats.size()){
//            System.out.println(allCats.get(i).getSpeaks());
//            i++;
//        }

    }




