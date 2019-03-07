public class Main {

/*    method: print numbers 1 - 100

    method: calculate multiples of 3

    method: print fizz

    method: calculate multiples of 5

    method: print buzz

    method: calculate multiples of 3 and 5

    method: print fizzbuzz
 */

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

    private static boolean isNumberMultipleOf3 (int number) {
        return (number % 3 == 0);
    }

    private static boolean isNumberMultipleOf5 (int number) {
        return (number % 5 == 0);
    }

    private static boolean isNumberMultipleOf3and5 (int number) {
        return (isNumberMultipleOf3(number)) && (isNumberMultipleOf5(number));
    }



    public static void main(String[] args) {

    int numbers = 1;

    while (numbers <= 100) {

        if (isNumberMultipleOf3(numbers)) {
            printFizz();
        }

        else if (isNumberMultipleOf5(numbers)) {
            printBuzz();
        }

        else if (isNumberMultipleOf3and5(numbers)) {
            printFizzBuzz();
        }

        else {
            printNumbers(numbers);
        }

        numbers++;

    }



        /*
        print numbers

        if multiple of 3, print fizz

        if multiple of 5, print buzz

        if multiple of 3 and 5, print fizzbuzz


         */


    }
}
