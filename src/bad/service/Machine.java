package bad.service;

import models.Document;

public interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void fax(Document doc);
}