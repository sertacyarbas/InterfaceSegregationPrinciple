package bad;

import bad.service.impl.MultiFunctionPrinter;
import bad.service.impl.SimpleScanner;
import bad.service.impl.SimplePrinter;
import models.Document;

public class Application {
    public static void main(String[] args) {
        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(new Document());
        multiFunctionPrinter.scan(new Document());
        multiFunctionPrinter.fax(new Document());
        
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(new Document());
        simplePrinter.scan(new Document()); // burada exception fırlatılır.
        simplePrinter.fax(new Document()); // burada exception fırlatılır.
        
        SimpleScanner scanner = new SimpleScanner();
        scanner.print(new Document()); // burada exception fırlatılır.
        scanner.scan(new Document());
        scanner.fax(new Document()); // burada exception fırlatılır.
    }
}