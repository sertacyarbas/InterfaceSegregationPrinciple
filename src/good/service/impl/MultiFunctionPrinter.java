package good.service.impl;

import good.service.*;
import models.Document;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
    @Override
    public void print(Document doc) {
        System.out.println("Belge yazdırılıyor.");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Belge taranıyor.");
    }

    @Override
    public void fax(Document doc) {
        System.out.println("Belge fakslanıyor.");
    }
}