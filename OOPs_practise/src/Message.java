import java.util.List;

public class Message {


    private static String welcomeMessage = "Welcome to Adopt A Pet!";
    private static String askForUserName = "\nWhat is your name?";
    private static String greetUser = "\nHi, ";
    private static String giveAnimalOptionsMessage = "\nChoose an animal to adopt: ";
    private static String confirmUserAnimalChoice = "\nYou have chosen a ";
    private static String displayAvailableChosenAnimals = ("\nWho would you like to adopt? Please choose one: \n");


    public static String getWelcomeMessage(){
        return welcomeMessage;
    }

    public static String getAskForUserName() {
        return askForUserName;
    }

    public static String getGreetUser(String userName) {
        return greetUser + userName;
    }

    public static String getGiveAnimalOptionsMessage() {
        return giveAnimalOptionsMessage;
    }

    public static String getConfirmUserAnimalChoice(String animal) {
        return confirmUserAnimalChoice + animal;
    }

    public static String getDisplayAvailableChosenAnimals() {
        return displayAvailableChosenAnimals;
    }

}

