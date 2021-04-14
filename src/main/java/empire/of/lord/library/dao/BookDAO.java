package empire.of.lord.library.dao;

import empire.of.lord.library.models.Book;
import empire.of.lord.library.models.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookDAO{

    private final BookRepo bookRepo;

    @Autowired
    public BookDAO(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


    public Iterable<Book> showAll(){
        return bookRepo.findAll();
    }

    public Optional<Book> show(int id){
        return bookRepo.findById(id);
    }

    public void create(Book book){
        bookRepo.save(book);
    }

    public void update(Book updatedBook){
        bookRepo.save(updatedBook);
    }

    public void delete(int id){
        bookRepo.deleteById(id);
    }
}
