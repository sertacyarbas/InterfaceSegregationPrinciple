package good;

import good.service.impl.*;
import models.Document;

public class Application {
    public static void main(String[] args) {
        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(new Document());
        multiFunctionPrinter.scan(new Document());
        multiFunctionPrinter.fax(new Document());
        
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(new Document());
        
        SimpleScanner scannerOnly = new SimpleScanner();
        scannerOnly.scan(new Document());
    }
}