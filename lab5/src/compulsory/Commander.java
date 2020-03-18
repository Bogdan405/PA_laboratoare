package compulsory;
/*
    "www.geeksforgeeks.org" serialization-in-java example used as reference
 */
import java.awt.*;
import java.io.*;

public class Commander {
    private int id;
    public Commander(int id){
        this.id = id;
    }

    public void save(String fileToSave,Catalog toSaveCatalog){
        //Serialization
        //a new file is created with the serialized info using writeObject
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileToSave);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(toSaveCatalog);

            out.close();
            fileOut.close();

            System.out.println("Object has been serialized");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public Catalog load(String fileToLoad){
        // Deserialization
        // New Catalog read from file and casted to the proper type (Catalog)
        Catalog deserializedTestCatalog1 = null;
        try
        {
            FileInputStream fileIn = new FileInputStream(fileToLoad);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            deserializedTestCatalog1 = (Catalog)in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Object has been deserialized ");

            System.out.println(deserializedTestCatalog1.getContainedDocuments().get(0).getTitle());
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        return deserializedTestCatalog1;
    }

    public void view(File fileToView){
        // relatively simple implementation, I used Desktop edit method for a file object passed as argument.
        try
        {
            Desktop currentDesktop = Desktop.getDesktop();
            currentDesktop.edit(fileToView);
            System.out.println("Object has been viewed");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
