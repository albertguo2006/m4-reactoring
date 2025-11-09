package theater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Small smoke test runner to sanity-check StatementPrinter output.
 */
public class SmokeMain {
    /**
     * Entry point for a small smoke test. This main method demonstrates the
     * expected output of the sample invoice printer using hard-coded data.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        final Map<String, Play> plays = new HashMap<>();
        plays.put("hamlet", new Play("Hamlet", "tragedy"));
        plays.put("as-like", new Play("As You Like It", "comedy"));
        plays.put("othello", new Play("Othello", "tragedy"));

        final int HAMLET_AUDIENCE = 55;
        final int AS_LIKE_AUDIENCE = 35;
        final int OTHELLO_AUDIENCE = 40;

        final List<Performance> performances = new ArrayList<>();
        performances.add(new Performance("hamlet", HAMLET_AUDIENCE));
        performances.add(new Performance("as-like", AS_LIKE_AUDIENCE));
        performances.add(new Performance("othello", OTHELLO_AUDIENCE));

        final Invoice invoice = new Invoice("BigCo", performances);

        final StatementPrinter printer = new StatementPrinter(invoice, plays);
        System.out.println(printer.statement());
    }
}
