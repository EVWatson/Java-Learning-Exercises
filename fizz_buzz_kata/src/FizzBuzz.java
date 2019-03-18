public class FizzBuzz {



    private static boolean isNumberMultipleOf3and5 (int number) {
        return (Fizz.getIsNumberMultipleOf3(number)) & (Buzz.getIsNumberMultipleOf5(number));
    }

    public static boolean getIsNumberMultipleOf3and5(int number){

        return isNumberMultipleOf3and5(number);
    }


    private static String printFizzBuzz () {
        System.out.println("FizzBuzz");
        return "FizzBuzz";
    }

    public static String getPrintFizzBuzz () {
        return printFizzBuzz();
    }

}
