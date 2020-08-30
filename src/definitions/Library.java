/*  Created by IntelliJ IDEA.
 *  User: Naman Kumar
 *  Date: 29/08/2020
 *  Time: 3:27 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] stock;

    public Library() {
        this.stock = new Book[10];
        for (int index = 0; index < stock.length; index++) {
            stock[index] = new Book("AvailableBook " + (index + 1));
        }
    }

    public Library(Book[] stock) {
        this.stock = stock;
    }

    public Book[] getStock() {
        return this.stock;
    }

    public void setStock(Book[] stock) {
        this.stock = stock;
    }

}
