import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String str = new String("Friyay");
        System.out.println(str);
    }
    public String reverse(String input) {
        String[] letters = input.split("");
        List<String> result = new ArrayList<String>();

        for(int i = letters.length - 1; i >= 0; i-- ) {
            result.add(letters[i]);
        }
        return String.join("", result);
    }
}
