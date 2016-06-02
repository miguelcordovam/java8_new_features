package locale;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

    public static void main(String[] args) {

        Locale locale = Locale.UK;
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        double money = 1_000_000.00d;

        System.out.println("Money: " + nf.format(money));

    }
}
