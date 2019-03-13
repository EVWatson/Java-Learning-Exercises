import java.util.Scanner;

public class Main {


    public static void getUserName() {
        Scanner answerQuestion = new Scanner(System.in);
        String userName = answerQuestion.nextLine();
        System.out.println("Hi " + userName);
    }
    

    public static void instruction1() {
        System.out.println("Are you a cat or a dog person? ");
    }


    public static void main(String[] args) {

        Message welcomeMessage = new Message("hello");

        welcomeMessage.printWelcomeMessage();

//        askForName();

        Message welcome = new Message("Welcome to the My Pets game!");
        Message askForUserName = new Message("What is your name?");

        getUserName();

//        greetUser();

        instruction1();

        Cat louie = new Cat("Louie", "Domestic Short Hair", 3, "Tabby", "Meow!");
        System.out.println(louie.catSpeaks());
        Cat pepper = new Cat( "Pepper", "Domestic Short Hair", 3, "Tortoise-Shell", "Purrrrrr");

    }



}
