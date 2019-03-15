public class Message {

//    String sentence;
//    public static String userName;

    private static String welcomeMessage = "Welcome to Adopt A Pet!";
    private static String askForUserName = "What is your name?";
    private static String greetUser = "Hi, ";
    private static String giveAnimalOptionsMessage = "Choose an animal to adopt:";

//    public Message(String sentence) {
////        this.sentence = sentence;
////    }

//    Message welcomeMessage = new Message("Welcome to Adopt A Pet");
//    Message askForUserName = new Message("What is your name?");

//    public String getSentence () {
//        return sentence;
//    }

    public static String getWelcomeMessage(){
        return welcomeMessage;
    }

    public static String getAskForUserName() {
        return askForUserName;
    }

    public static String getGreetUser(String userName) {
        return greetUser + userName;
    }

}

