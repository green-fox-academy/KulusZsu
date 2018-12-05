package bookstore;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
  List<Books> bookList;

  public Bookstore() {
    this.bookList = new ArrayList<>();
  }

  public void addBook(Books item) {
    bookList.add(item);
  }

  public String getLightestBook() {
    int weight = this.bookList.get(0).weight;
    String author = this.bookList.get(0).author;
    String title = this.bookList.get(0).title;

    for (Books book : bookList) {
      if (book.weight < weight) {
        weight = book.weight;
        author = book.author;
        title = book.title;
      }
    }
    return author + ": " + title;
  }

  public String getBooksWithMostPages() {
    int pageNumber = this.bookList.get(0).pageNumber;
    String author = this.bookList.get(0).author;
    String title = this.bookList.get(0).title;

    for (Books book : bookList) {
      if (book.weight > pageNumber) {
        pageNumber = book.pageNumber;
        author = book.author;
        title = book.title;
      }
    }
    return author + ": " + title;
  }
}
