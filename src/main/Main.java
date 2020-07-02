package main;

import deserialization.Deserialization;
import model.Student;
import serialization.Serialization;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by A.A.MAMUN on 7/2/2020.
 */

/**
 * In this program we serialize a student object.
 * we can also serialize a list of object using
 * java.util.ArrayList.
 */
public class Main {

    public static void main(String[] args) {

        // student.ser file to store student object
        File file = new File("/student.ser");

        // student object serialization
        Serialization serialization = new Serialization(file);
        Student student = new Student(16001, "Sabbir Ahamed", "ICT", 11023345);
        serialization.doSerialized(student);

        Deserialization deserialization = new Deserialization(file);
        /**
         * deserialization() method return Object type Object
         * so we need to cast Object type to Student type.
         */
        Student deserializeStudentObject = (Student) deserialization.getDeserializeObject();
        System.out.println("# Deserialize Student :");
        System.out.println(deserializeStudentObject);

        /**
         * Object list serialization and deserialization.
         */
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(16002, "Mi Roni", "ICT", 43562334));
        studentList.add(new Student(16010, "Salman Khan", "Chemistry", 12783567));
        studentList.add(new Student(16034, "Rubel Ahmed", "Mathematics", 33568873));
        studentList.add(new Student(16044, "Milon Ahmed", "BBA", 23456733));

        File file2 = new File("/student_list.ser");
        Serialization serialization2 = new Serialization(file2);
        serialization2.doSerialized(studentList);

        Deserialization deserialization2 = new Deserialization(file2);
        List<Student> deserializeStudentObjectList = (List<Student>) deserialization2.getDeserializeObject();
        System.out.println("\n# Deserialize Student List :");
        for (Student s : deserializeStudentObjectList){
            System.out.println(s);
        }

    }

}
