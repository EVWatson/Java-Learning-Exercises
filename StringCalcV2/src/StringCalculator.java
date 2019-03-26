public class StringCalculator {


    public int add(String input) {

        if (input.equals("")) {
            return 0;
        }   String [] numbers = input.split(",");
            int sum = 0;
            for (String s : numbers) {
              int number = Integer.parseInt(s);
                sum += number;
            }
            return sum;
    }

}
