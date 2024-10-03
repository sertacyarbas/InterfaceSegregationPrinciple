package bad.service.impl;

import bad.service.Machine;
import models.Document;

public class MultiFunctionPrinter implements Machine {
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