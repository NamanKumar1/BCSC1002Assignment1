 /*  Created by IntelliJ IDEA.
  *  User: Naman Kumar
  *  Date: 28/08/2020
  *  Time: 8:52 PM
  *  File Name : Book.java
  * */
 package definitions;

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
 }