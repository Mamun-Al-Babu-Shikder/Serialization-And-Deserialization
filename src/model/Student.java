package model;

import java.io.Serializable;

/**
 * Created by A.A.MAMUN on 7/2/2020.
 */
public class Student implements Serializable {

    private int id;
    private String name;
    private String department;
    /**
     * Transient modifier is the modifier applicable for only variables and we can’t apply for methods and classes.
     * 1. At the time of serialization, if we don’t want to save the values of a particular variable to meet
     * security constraints then we should go for transient modifier.
     * 2. At the time of serialization JVM ignores the original value of transient variable and default value
     * will be serialized
     */
    private transient long accountNumber;

    public Student(int id, String name, String department, long accountNumber) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
