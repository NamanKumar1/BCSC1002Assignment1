 /*  Created by IntelliJ IDEA.
  *  User: Naman Kumar
  *  Date: 28/08/2020
  *  Time: 8:52 PM
  *  File Name : Book.java
  * */
 package definitions;

 import java.util.Objects;

 public class Book {
  private String nameOfBook;
  private String authorOfBook;
  private String NumberOfBook;

  public Book() {
   nameOfBook = "Let's Java";
   authorOfBook = "S.Chandra";
   NumberOfBook = "2558463278";
  }

  public Book(String nameOfBook, String authorOfBook, String NumberOfBook) {
   this.nameOfBook = nameOfBook;
   this.authorOfBook = authorOfBook;
   this.NumberOfBook = NumberOfBook;
  }

  public Book(String nameOfBook) {
   this.nameOfBook = nameOfBook;
  }

  public String getNameOfBook() {
   return this.nameOfBook;
  }

  public void setNameOfBook(String nameOfBook) {
   this.nameOfBook = nameOfBook;
  }

  public String getAuthorOfBook() {
   return this.authorOfBook;
  }

  public void setAuthorOfBook(String authorOfBook) {
   this.authorOfBook = authorOfBook;
  }

  public String getNumberOfBook() {
   return this.NumberOfBook;
  }

  public void setNumberOfBook(String NumberOfBook) {
   this.NumberOfBook = NumberOfBook;
  }

  public void getData() {
   System.out.println("Book Name: " + nameOfBook);
  }

  @Override
  public String toString() {
   return "Book{" +
           "nameOfBook='" + nameOfBook + '\'' +
           ", authorOfBook='" + authorOfBook + '\'' +
           ", NumberOfBook='" + NumberOfBook + '\'' +
           '}';
  }

  @Override
  public boolean equals(Object o) {
   if (this == o) return true;
   if (!(o instanceof Book)) return false;
   Book book = (Book) o;
   return Objects.equals(getNameOfBook(), book.getNameOfBook()) &&
           Objects.equals(getAuthorOfBook(), book.getAuthorOfBook()) &&
           Objects.equals(getNumberOfBook(), book.getNumberOfBook());
  }
 }