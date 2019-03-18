public class Fizz {

//    private static boolean isNumberMultipleOf3 (int number) {
//        return (number % 3 == 0);
//    }

    public static boolean isNumberMultipleOf3(int number){
//        return isNumberMultipleOf3(number);
        return (number % 3 == 0);
    }


    private static String printFizz () {

        System.out.println("Fizz");
        return "Fizz";
    }

    public static String getPrintFizz () {
        return printFizz();
    }

}
