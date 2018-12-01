package BlogPostExtended;

import java.util.ArrayList;

public class Blog {
  ArrayList<BlogPostExtended> listOfBlogPosts;

  public Blog(ArrayList<BlogPostExtended> inputList) {
    this.listOfBlogPosts = inputList;
  }

  public void delete(int index) {
    listOfBlogPosts.remove(index);
  }

  public void update(int index, BlogPostExtended listToAdd) {
    listOfBlogPosts.set(index, listToAdd);
  }
}
