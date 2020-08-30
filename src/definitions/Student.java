/*  Created by IntelliJ IDEA.
 *  User: Naman Kumar
 *  Date: 29/08/2020
 *  Time: 4:32 PM
 *  File Name : Student.java
 * */
package definitions;

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
}
