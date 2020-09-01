package matchers;

/**
 * @author daniil.timashov on 31.08.2020
 */
public class Matchers {

    public static Matcher displayed() {
        return new Matcher() {
            @Override
            public boolean matches() {
                System.out.println("Check that element is displayed");
                return true;
            }
        };
    }

    public static Matcher absent() {
        return new Matcher() {
            @Override
            public boolean matches() {
                System.out.println("Check that element is absent");
                return false;
            }
        };
    }
}
