package bad.service.impl;

import bad.service.Machine;
import models.Document;

public class SimplePrinter implements Machine {
    @Override
    public void print(Document doc) {
        // Yazdırma işlemi
        System.out.println("Belge yazdırılıyor.");
    }

    @Override
    public void scan(Document doc) {
        // Desteklenmiyor
        throw new UnsupportedOperationException("Tarama özelliği desteklenmiyor.");
    }

    @Override
    public void fax(Document doc) {
        // Desteklenmiyor
        throw new UnsupportedOperationException("Faks özelliği desteklenmiyor.");
    }
}