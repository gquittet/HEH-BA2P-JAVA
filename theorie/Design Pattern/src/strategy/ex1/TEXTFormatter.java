package strategy.ex1;

/**
 * TEXTFormatter
 * Format a text to text
 */
public class TEXTFormatter implements IFormatter {

    @Override
    public String toString(String text) {
        return "\"" + text + "\"";
    }
}