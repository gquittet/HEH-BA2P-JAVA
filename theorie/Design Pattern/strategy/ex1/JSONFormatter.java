package strategy.ex1;


/**
 * JSONFormatter
 * Format text into JSON
 */
public class JSONFormatter implements IFormatter {

    @Override
    public String toString(String text) {
        return "text: \"" + text + "\"";
    }
}