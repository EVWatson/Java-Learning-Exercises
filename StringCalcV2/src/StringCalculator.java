import java.util.ArrayList;

public class StringCalculator {

static final String REGEX = "[,\n;!@#$%&*]+";
static final String NEGATIVENUMEXCEPTION = "Negatives not allowed: ";




    public int add(String input) {

        if (input.equals("")) {
            return 0;
        }

        String [] numbers = input.split(REGEX);
//        input.matches("^//");

            if (input.startsWith("//")) {
//             numbers2 = input.substring(4);
////             numbers = numbers2.split(REGEX);
                String [] pieces = input.split("\n");
                String piece2 = pieces[1];

               numbers = piece2.split(REGEX);
            }

            int sum = 0;
            ArrayList <String> negativeNumbers = new ArrayList<>();

            for (String s : numbers ) {
                int number = Integer.parseInt(s);

                if ( number < 0) {
                    negativeNumbers.add(s);
                }

                if (number >= 1000) {
                    sum -= number;
                }

                sum += number;
            }
             if (!negativeNumbers.isEmpty()) {

            throw new ArithmeticException(NEGATIVENUMEXCEPTION + negativeNumbers);
              }

            return sum;
    }

}
