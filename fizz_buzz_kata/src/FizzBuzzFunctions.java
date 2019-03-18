public class FizzBuzzFunctions {
    public static boolean isNumberMultipleOf3 (int number) {
        return (number % 3 == 0);
    }

    public static boolean isNumberMultipleOf5 (int number) {
        return (number % 5 == 0);
    }

    public static boolean isNumberMultipleOf3and5 (int number) {
        return (isNumberMultipleOf3(number)) & (isNumberMultipleOf5(number));
    }
}
