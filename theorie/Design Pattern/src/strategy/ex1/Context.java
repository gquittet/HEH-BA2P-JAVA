package strategy.ex1;

/**
 * Context
 * The context of the Formatter strategy
 */
public class Context {

    private IFormatter formatter;

    /**
     * Make a new Context
     * @param formatterThe current formatter
     */
    public Context(IFormatter formatter) {
        this.formatter = formatter;
    }

    /**
     * Convert the text into the correct format
     * @param text The text
     */
    public String executeStrategy(String text) {
        return formatter.toString(text);
    }

    /**
     * Update the current text format
     * @param formatter The new format
     */
    public void setContext(IFormatter formatter) {
        this.formatter = formatter;
    }
}