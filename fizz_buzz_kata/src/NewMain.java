public class NewMain {

    private static void printNumbers (int numbers) {
        System.out.println(numbers);
    }

    public static void main(String[] args) {

        int numbers = 1;

        while (numbers <= 100) {

            if (FizzBuzz.getIsNumberMultipleOf3and5(numbers)) {
                FizzBuzz.getPrintFizzBuzz();
            }

            else if (Fizz.isNumberMultipleOf3(numbers)) {
                Fizz.getPrintFizz();
            }

            else if (Buzz.getIsNumberMultipleOf5(numbers)) {
                Buzz.getPrintBuzz();
            }


            else {
                printNumbers(numbers);
            }

            numbers++;

        }


    }


}
