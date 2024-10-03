package good.service.impl;

import good.service.Scanner;
import models.Document;

public class SimpleScanner implements Scanner {
    @Override
    public void scan(Document doc) {
        System.out.println("Belge taranıyor.");
    }
}