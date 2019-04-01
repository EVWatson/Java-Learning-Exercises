import java.util.ArrayList;

public class StringCalculator {

static final String REGEX = "[,;!@#$%&*\n]+";
static final String EXCEPTION_MESSAGE = "Negatives not allowed: ";
static final String NUMBER_REGEX_PATTERN = "(%1%)";

    public int add(String input) {

        if (input.equals("")) {
            return 0;
        }

        String [] numbers;
//        input.matches("^//");

        if (input.startsWith("//")) {
            String[] pieces = input.split("\n");
            String piece1 = pieces[0].substring(2);
            String piece2 = pieces[1];

            String newRegex = piece1.replace("][", "|");
//            System.out.println(newRegex);

            numbers = piece2.split(REGEX);


//            if(piece2.contains(NUMBER_REGEX_PATTERN)) {
//
//                String [] furtherDivisions = piece2.
//
//                numbers = piece2.split((NUMBER_REGEX_PATTERN) + (REGEX));
//
//            }
//            numbers = piece2.split(REGEX);
        } else {
            numbers = input.split(REGEX);
        }


//            if (input.startsWith("//")) {
////             numbers2 = input.substring(4);
//////             numbers = numbers2.split(REGEX);
//                String [] pieces = input.split("\n");
//                String piece2 = pieces[1];
//
////                    if(piece2.contains(REGEX + "1" + REGEX)) {
////                        numbers = piece2.split(REGEX + "1" + REGEX + REGEX);
////                }
//
//                Pattern numberRegex = Pattern.compile("(%1%)");
//                Matcher matchNumberRegex = numberRegex.matcher(piece2);
//                    if (matchNumberRegex.find()) {
//                       numberRegexPattern = (matchNumberRegex.group(0));
//                            for (int i = 0; i < piece2.length(); i++ ) {
//                                piece2.split(numberRegexPattern + REGEX);
//                            }
//                }
//
//               numbers = piece2.split(REGEX);
//
//            }

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

            throw new ArithmeticException(EXCEPTION_MESSAGE + negativeNumbers);
              }

            return sum;
    }

}
