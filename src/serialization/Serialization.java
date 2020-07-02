package serialization;

import model.Student;

import java.io.*;

/**
 * Created by A.A.MAMUN on 7/2/2020.
 */

/**
 * The process of saving an object to a file (or)
 * the process of sending an object across
 * the network is called serialization.
 */
public class Serialization {

    private File file;

    public Serialization(File file){
        this.file = file;
    }

    /**
     * serialization process :
     * To do the serialization we required fallowing classes
     * 1. FileOutputStream
     * 2. ObjectOutputStream
     */
    public void doSerialized(Object object){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException   e) {
            e.printStackTrace();
        }
    }

}
