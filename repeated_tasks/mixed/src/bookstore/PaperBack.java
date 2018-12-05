package bookstore;

public class PaperBack extends Books {
  public PaperBack(String title, String author, int releaseYear, int pageNumber) {
    super(title, author, releaseYear, pageNumber);
    this.weight = weight + 20;
  }
}
