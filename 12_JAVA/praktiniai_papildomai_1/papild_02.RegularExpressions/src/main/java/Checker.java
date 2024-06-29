import java.util.regex.Pattern;

public class Checker {
    public boolean isDayOfWeek(String string) {
        return Pattern.matches("^(?i)(Mon|Tue|Wed|Thu|Fri|Sat|Sun)$", string);
    }

    public boolean allVowels(String string) {
        return Pattern.matches("(?i)[aeiou]*", string);
    }

    public boolean timeOfDay(String string) {
        return Pattern.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$", string);
    }
}
