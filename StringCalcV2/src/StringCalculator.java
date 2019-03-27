import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

static final String REGEX = "[,\n;!@#$%&*]";




    public int add(String input) {

        if (input.equals("")) {
            return 0;

        }
        String [] numbers = input.split(REGEX);
        String numbers2;
//        input.matches("^//");

            if (input.startsWith("//")) {
             numbers2 = input.substring(4);
             numbers = numbers2.split(REGEX);
            }

            int sum = 0;
            for (String s : numbers ) {
                int number = Integer.parseInt(s);
                sum += number;
            }

            return sum;
    }

}
