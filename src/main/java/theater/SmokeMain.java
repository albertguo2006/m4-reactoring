package theater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Small smoke test runner to sanity-check StatementPrinter output.
 */
public class SmokeMain {
    public static void main(String[] args) {
        Map<String, Play> plays = new HashMap<>();
        plays.put("hamlet", new Play("Hamlet", "tragedy"));
        plays.put("as-like", new Play("As You Like It", "comedy"));
        plays.put("othello", new Play("Othello", "tragedy"));

        List<Performance> performances = new ArrayList<>();
        performances.add(new Performance("hamlet", 55));
        performances.add(new Performance("as-like", 35));
        performances.add(new Performance("othello", 40));

        Invoice invoice = new Invoice("BigCo", performances);

        StatementPrinter printer = new StatementPrinter(invoice, plays);
        System.out.println(printer.statement());
    }
}
