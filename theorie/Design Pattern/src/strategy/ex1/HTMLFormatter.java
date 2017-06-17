package strategy.ex1;

/**
 * HTMLFormatter
 * Format text to HTML
 */
public class HTMLFormatter implements IFormatter {

    @Override
    public String toString(String text) {
        return "<p>" + text + "</p>";
    }
}