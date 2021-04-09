package empire.of.lord.library.repos;

import empire.of.lord.library.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepos extends CrudRepository<Book, Integer> {
}
