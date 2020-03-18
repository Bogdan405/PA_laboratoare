package compulsory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Declarations
        System.out.println("");
        Catalog testCatalog1 = new Catalog();
        List<Document> testDocuments1 = new ArrayList<>();
        //we have one document in the Catalog:
        testDocuments1.add(new Document("D:invalid_path","nonexistent_file"));
        testCatalog1.setContainedDocuments(testDocuments1);
        //we use the commands from the Commander class, the int argument is in case a future implementation will require it (not used now)
        Commander testCommander1 = new Commander(1);

        //we save the Catalog as a file named with the String given as argument
        testCommander1.save("serializedFile1",testCatalog1);

        //we load in the same manner, based on the String given as argument, the System.outs are just to check everything is working fine.
        Catalog testDeserializationCatalog = testCommander1.load("serializedFile1");
        System.out.println(testDeserializationCatalog.getContainedDocuments().get(0).getLocation());

        //we create a new File, it must exist on the disk and a path must be provided
        //I used a local file to check and it opened ok, if the path is to a folder or something not supported an exception should be outputted.
        File testFile1 = new File("D:\\temp.txt");
        testCommander1.view(testFile1);
    }
}
