package strategy.ex1;


/**
 * Reformatter
 */
public class Reformatter {

    public static void main(String[] args) {
        Context context = new Context(new TEXTFormatter());
        System.out.println(context.executeStrategy("salut"));
        context.setContext(new HTMLFormatter());
        System.out.println(context.executeStrategy("salut"));
        context.setContext(new XMLFormatter());
        System.out.println(context.executeStrategy("salut"));
        context.setContext(new JSONFormatter());
        System.out.println(context.executeStrategy("salut"));
    }
}