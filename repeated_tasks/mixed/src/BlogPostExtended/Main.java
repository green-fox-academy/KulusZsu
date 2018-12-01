package BlogPostExtended;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    BlogPostExtended one = new BlogPostExtended(
        "John Doe",
        "Lorem Ipsum",
        "Lorem ipsum dolor sit amet.",
        "2000.05.04.");

    BlogPostExtended two = new BlogPostExtended(
        "Tim Urban",
        "Wait but why",
        "A popular long-form, stick-figure-illustrated blog about almost everything.",
        "2010.10.10.");

    BlogPostExtended three = new BlogPostExtended(
        "William Turton",
        "One Engineer Is Trying to Get IBM to Reckon With Trump",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t " +
            "want to be the center of attention. When I asked to take his " +
            "picture outside one of IBM’s New York City offices, he told " +
            "me that he wasn’t really into the whole organizer profile thing.",
        "2017.03.28.");

    String str = (", ");
    System.out.println(one.authorName + str + one.title + str + one.publicationDate);
    System.out.println(two.authorName + str + two.title + str + two.publicationDate);
    System.out.println(three.authorName + str + three.title + str + three.publicationDate);
    System.out.println();

    // put the above mentioned three BlogPost into the Array list
    ArrayList<BlogPostExtended> listFromMain = new ArrayList<>();
    BlogPostExtended four = new BlogPostExtended("bla", "bla", "bla", "1900");
    listFromMain.add(one);
    listFromMain.add(two);
    listFromMain.add(three);
    listFromMain.add(four);

    Blog blogInMain = new Blog(listFromMain);
    System.out.println(blogInMain.listOfBlogPosts.size());  // result: 4 --> there are 3 things on the list, that's ok
    System.out.println();
    System.out.println(one.authorName + str + one.title + str + one.publicationDate);
    System.out.println(two.authorName + str + two.title + str + two.publicationDate);
    System.out.println(three.authorName + str + three.title + str + three.publicationDate);
    System.out.println(four.authorName + str + four.title + str + four.publicationDate);
    System.out.println();

    blogInMain.delete(3);
    System.out.println(blogInMain.listOfBlogPosts.size());

  }
}

