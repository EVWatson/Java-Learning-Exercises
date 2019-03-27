import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {




//    private String delimiter = "\\d";


    public int add(String input) {

        if (input.equals("")) {
            return 0;

        }
        String [] numbers = input.split("[,\n;]");
        String numbers2;
//        input.matches("^//");

            if (input.startsWith("//")) {
             numbers2 = input.substring(4);
             System.out.println(numbers2);
             numbers = numbers2.split(";");
//^//(.)"       java pattern.compile
            }

            int sum = 0;
            for (String s : numbers ) {
                int number = Integer.parseInt(s);
                sum += number;
            }

            return sum;
    }

}
