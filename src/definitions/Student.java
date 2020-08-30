/*  Created by IntelliJ IDEA.
 *  User: Naman Kumar
 *  Date: 29/08/2020
 *  Time: 4:32 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    Student studentObject = new Student();
    private String studentName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] name;

    public Student() {
        studentName = "Naman Kumar";
        universityRollNumber = 191500473;
        numberOfBooksIssued = 3;
        this.name = new Book[3];
        for (int index = 0; index < name.length; index++) {
            name[index] = new Book("IssuedBook " + (index + 1));
        }
    }

    public Student(String studentName, long universityRollNumber, int numberOfBooksIssued, Book[] name) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.name = new Book[5];
        for (int index = 0; index < name.length; index++) {
            name[index] = new Book("Book " + (index + 1));
        }
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNumber() {
        return this.universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return this.numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getName() {
        return this.name;
    }

    public void setName(Book[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", name=" + Arrays.toString(name) +
                '}';
    }
}
