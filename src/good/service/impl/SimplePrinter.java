package good.service.impl;

import good.service.Printer;
import models.Document;

public class SimplePrinter implements Printer {
    @Override
    public void print(Document doc) {
        System.out.println("Belge yazdırılıyor.");
    }
}