package compulsory;

import java.io.Serializable;
import java.util.List;

public class Catalog implements Serializable {
    private List<Document> containedDocuments;

    public List<Document> getContainedDocuments() {
        return containedDocuments;
    }

    public void setContainedDocuments(List<Document> containedDocuments) {
        this.containedDocuments = containedDocuments;
    }
}

