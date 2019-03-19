public class FizzBuzzFunctions {
    public static String determineFizzBuzz(int numbers) {
        if (MathsFunctions.isNumberMultipleOf3and5(numbers)) {
            return "FizzBuzz";
        }
        else if (MathsFunctions.isNumberMultipleOf3(numbers)) {
            return "Fizz";
        }
        else if (MathsFunctions.isNumberMultipleOf5(numbers)) {
            return "Buzz";
        }
        else {
            return convertToString(numbers);
        }
    }

    private static String convertToString (int numbers) {
        return Integer.toString(numbers);
    }
}
