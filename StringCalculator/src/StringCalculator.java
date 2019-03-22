public class StringCalculator {
    public int add(String input) {
        if (input.equals("")) {
            return 0;
        }
        if (input.startsWith("//")) {
            String [] splitInputWithDeliminator = input.split("\n");

//            split input on next char
           char newDelimiterAsChar = input.charAt(2);
//            delimiter always between // and \n
            String  newDelimiterAsString = Character.toString(newDelimiterAsChar);
            String [] splitNewDelimiter = splitInputWithDeliminator[1].split(newDelimiterAsString);
                int sum = 0;
                for (String d : splitNewDelimiter) {
                    sum += Integer.parseInt(d);
                }
                return sum;
        }
            int sum = 0;
       String [] splitInput = input.split(",|\n");
            for (String s : splitInput) {
                sum += Integer.parseInt(s);
            }
        return sum;
    }
}
