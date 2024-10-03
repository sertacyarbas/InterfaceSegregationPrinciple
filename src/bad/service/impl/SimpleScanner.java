package bad.service.impl;

import bad.service.Machine;
import models.Document;

public class SimpleScanner implements Machine {
    @Override
    public void print(Document doc) {
        // Desteklenmiyor
        throw new UnsupportedOperationException("Yazdırma özelliği desteklenmiyor.");
    }

    @Override
    public void scan(Document doc) {
        // Tarama işlemi
        System.out.println("Belge taranıyor.");
    }

    @Override
    public void fax(Document doc) {
        // Desteklenmiyor
        throw new UnsupportedOperationException("Faks özelliği desteklenmiyor.");
    }
}