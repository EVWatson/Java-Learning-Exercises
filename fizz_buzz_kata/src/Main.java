public class Main {

    private static void printNumbers (int numbers) {
        System.out.println(numbers);
    }

    private static void printFizz () {
        System.out.println("Fizz");
    }

    private static void printBuzz () {
        System.out.println("Buzz");
    }

    private static void printFizzBuzz () {
        System.out.println("FizzBuzz");
    }

    public static void main(String[] args) {

    int numbers = 1;

    while (numbers <= 100) {

        if (FizzBuzzFunctions.isNumberMultipleOf3and5(numbers)) {
            printFizzBuzz();
        }

        else if (FizzBuzzFunctions.isNumberMultipleOf3(numbers)) {
            printFizz();
        }

        else if (FizzBuzzFunctions.isNumberMultipleOf5(numbers)) {
            printBuzz();
        }


        else {
            printNumbers(numbers);
        }

        numbers++;

    }


    }
}
