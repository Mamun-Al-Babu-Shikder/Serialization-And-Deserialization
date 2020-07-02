package deserialization;

import model.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by A.A.MAMUN on 7/2/2020.
 */

/**
 * The process of reading the object from file
 * supported form or network supported form to the
 * java supported form is called deserialization
 */
public class Deserialization {

    private File file;

    public Deserialization(File file){
        this.file = file;
    }

    /**
     * Deserialization process :
     * We can achieve the deserialization by using fallowing classes.
     * 1. FileInputStream
     * 2. ObjectInputStream
     */
    public Object getDeserializeObject(){
        Object object = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object =  objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return object;
    }
}
