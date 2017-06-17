package strategy.ex1;

/**
 * XMLFormatter
 * Format a text to XML
 */
public class XMLFormatter implements IFormatter {

    @Override
    public String toString(String text) {
        return "<text>" + text + "</text>";
    }
}