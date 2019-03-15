import java.util.ArrayList;
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
//        System.out.println("Hi " + userName);
        return userName;
    }



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




        Cat louie = new Cat("Louie", "Domestic Short Hair", 3, "Tabby", "Meow!");
//        System.out.println(louie.getSpeaks());
        Cat pepper = new Cat( "Pepper", "Domestic Short Hair", 3, "Tortoise-Shell", "Purrrrrr");

        ArrayList<Cat> allCats = new ArrayList<>();
        allCats.add(louie);
        allCats.add(pepper);
        int i = 0;
        while(i<allCats.size()){
            System.out.println(allCats.get(i).getSpeaks());
            System.out.println(Cat.getGenusStatic());
            i++;
        }

    }



}
