package dev.memora.css;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CssColorParser {
    private CssColorParser() {

    }

    public static CssColor parse(String  sccColor) { // sccColor = "rgb(1, 98, 177)"
        Pattern pattern = Pattern.compile("\\d{1,3}");
        Matcher matcher = pattern.matcher(sccColor);

        int[] values = new int[3];
        int i = 0;
        while (matcher.find() && i < 3) {
            values[i] = Integer.parseInt(matcher.group());
            i++;
        }
        // TO DO add some validations and checks!
        return new CssColor(values[0], values[1], values[2]);
    }
}
