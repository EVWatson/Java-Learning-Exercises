public class Buzz {

    private static boolean isNumberMultipleOf5 (int number) {

        return (number % 5 == 0);
    }

    public static boolean getIsNumberMultipleOf5(int number){

        return isNumberMultipleOf5(number);
    }

    private static String printBuzz () {
        System.out.println("Buzz");
        return  "Buzz";
    }

    public static String getPrintBuzz () {
        return printBuzz();
    }


}
