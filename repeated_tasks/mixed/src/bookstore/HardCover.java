package bookstore;

public class HardCover extends Books {
  public HardCover(String title, String author, int releaseYear, int pageNumber) {
    super(title, author, releaseYear, pageNumber);
    this.weight = weight + 100;
  }
}
