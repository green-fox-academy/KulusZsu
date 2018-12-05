package bookstore;

public abstract class Books {
  String title;
  String author;
  int releaseYear;
  int pageNumber;
  int weight;

  public Books(String title, String author, int releaseYear, int pageNumber) {
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
    this.pageNumber = pageNumber;
    this.weight = pageNumber * 10;
  }

  public String toString() {
    return "The title is : " + this.title + " by " + this.author + " released in " + this.releaseYear;
  }
}
