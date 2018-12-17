package listingtodosh2.example.listingtodosh2.repository;

import listingtodosh2.example.listingtodosh2.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
