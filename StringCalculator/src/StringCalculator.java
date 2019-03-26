import java.util.ArrayList;

public class StringCalculator {
    private int calculateSumFromArray(String[] numbers) {
        int sum = 0;
        ArrayList<String> errorNumbers = new ArrayList<>();
        for (String s : numbers) {
            int number = Integer.parseInt(s);
            if (number < 0) {
                errorNumbers.add(s);
            }
            sum += number;
        }
        if(!errorNumbers.isEmpty()){
//            errorNumbers = ["-1", "-3"]
            String stringOfErrors = "";


            for (int i = 0; i < errorNumbers.size();i++){
//                conditional formatting here

                String punctuation = ", ";
                    stringOfErrors = stringOfErrors.concat(errorNumbers.get(i) + punctuation);
            }
            throw new IllegalArgumentException("Negative numbers not allowed: " + stringOfErrors);
        }
        return sum;
    }

    public int add(String input) {
        int finalSum;
        if (input.equals("")) {
            return 0;
        }
        if (input.startsWith("//")) {
            String [] splitInputWithDeliminator = input.split("\n");
//            String newDelimiterAsString = input.substring(2,3);
            char newDelimiterAsChar = input.charAt(2);
            String newDelimiterAsString = Character.toString(newDelimiterAsChar);
            String [] splitNewDelimiter = splitInputWithDeliminator[1].split(newDelimiterAsString);
            finalSum = calculateSumFromArray(splitNewDelimiter);
        } else {
            String[] splitInput = input.split(",|\n");
            finalSum = calculateSumFromArray(splitInput);
        }
        return finalSum;

    }
}
