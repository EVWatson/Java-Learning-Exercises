import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

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


    public static void main(String[] args) {


        printString(Message.getWelcomeMessage());
//        printString(Message.getUserNamePrompt());

        printString(Message.getAskForUserName());

        String userName = getUserName();

        printString(Message.getGreetUser(userName));

        printString(Message.getGiveAnimalOptionsMessage());

        printString(Adoption_centre.getAvailableAnimals());

        String userChoiceOfAnimal = getUserAnimalChoice();



//        if (userChoiceOfAnimal.equals("1")) {
//            String choice = "cat";
////            display message for choice of animal
//            printString(Message.getConfirmUserAnimalChoice(choice));
////            display available cats
//
//            printString(Message.getDisplayAvailableChosenAnimals());
//
//            List<Cat> allCats = Arrays.asList(
//                    new Cat("Louie", "Domestic Short Hair", 3, "Tabby", "Meow!"),
//                    new Cat( "Pepper", "Domestic Short Hair", 3, "Tortoise-Shell", "Purrrrrr"),
//                    new Cat("Freddie", "Burmese", 5, "Champagne", "Meow!"),
//                    new Cat("Stormy Monday", "Domestic Short Hair", 1, "Tabby", "Mreow!"),
//                    new Cat("Philomena", "Domestic Short Hair", 1, "Tabby", "Mew!"));
//
//            for(Cat c : allCats) {
//                System.out.println("Name: " + c.getCatName() + ", Colour: " + c.getCatColour());
//            }
//
//
////            get user choice of cat
////            check if user would like to re-name cat
//        } else if (userChoiceOfAnimal.equals("2")) {
//            String choice = "dog";
//
//            printString(Message.getConfirmUserAnimalChoice(choice));
//
//            printString(Message.getDisplayAvailableChosenAnimals());
//
//            List<Dog> allDogs = Arrays.asList(
//                    new Dog ("Jack", "German Shepherd X Rottweiler", 5, "Tan and black", "Woof woof!"),
//                    new Dog ("Cassy", "Labrador X Cocker Spaniel", 2, "Golden", "Wuff wuff!"),
//                    new Dog ("Lola", "Staffordshire Terrier", 1, "Black", "Woof!"),
//                    new Dog ("Ben", "Poodle X Maltease Terrier", 8, "Brown", "Wuff!"),
//                    new Dog ("Sugar", "Poodle", 4, "White", "Bow wow!")
//            );
//            for (int d = 0; d < allDogs.size(); d++)
//                System.out.println(allDogs.get(d).getDogName() + ", " + allDogs.get(d).getDogBreed() + ", " + allDogs.get(d).getDogColour());
//        }

        int cat = 1;
        int dog = 2;

        switch (cat + dog) {
            case 1: System.out.println("cat");
                break;
            case 2: System.out.println("Dog");
                break;
                default: System.out.println("please choose an animal");
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




