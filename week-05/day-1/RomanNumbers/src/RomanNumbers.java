import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanNumbers {

    public String convertToRomanI(int arabic) {

        StringBuilder sb = new StringBuilder();

        int remaining = arabic;

        List<Integer> values = new ArrayList<>(Arrays.asList(9,5,4,1));
        List<String> romanSymbols = new ArrayList<>(Arrays.asList("IX", "V", "IV", "I"));

        for (int i = 0; i < values.size() ; i++) {
            remaining = convert(remaining, sb, values.get(i), romanSymbols.get(i));
        }
        return sb.toString();
    }

    private int convert(int remaining, StringBuilder sb, int value, String roman) {
        while (remaining >= 0) {
            if (remaining >= value) {
                sb.append(roman);
                remaining -= value;
            } else {
                sb.append("I");
                remaining--;
            }

        }
        return remaining;
    }
}
