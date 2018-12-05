package bookstore;

public class Main {
  public static void main(String[] args) {
    Bookstore bookstore = new Bookstore();

    Books egyKonyv = new HardCover("Shine","Stephen King",1977,80);
    Books egyKonyv_ = new HardCover("Whinnie the pooh","A. A. Milne",1926,100);

    Books megEgyKonyv = new PaperBack("It","Stephen King",1986,130);
    Books megEgyKonyv_ = new PaperBack("Coma","Robin Cook",1977,110);

    bookstore.addBook(egyKonyv);
    bookstore.addBook(egyKonyv_);
    bookstore.addBook(megEgyKonyv);
    bookstore.addBook(megEgyKonyv_);

    System.out.println("The longest book is: " + bookstore.getBooksWithMostPages());
    System.out.println("The lightest book is: " + bookstore.getLightestBook());
    //System.out.println(egyKonyv.weight);
    //System.out.println(megEgyKonyv.weight);
  }
}
