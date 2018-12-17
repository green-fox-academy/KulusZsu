package listingtodosh2.example.listingtodosh2.model;

import javax.persistence.*;

@Entity
@Table(name = "Todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(String title) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  Todo(){
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }
}
