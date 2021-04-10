package empire.of.lord.library.controllers;

import empire.of.lord.library.dao.BookDAO;
import empire.of.lord.library.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BooksController {

    private final BookDAO bookDAO;

    @Autowired
    public BooksController(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @GetMapping
    public String showAll(Model model){
        model.addAttribute("books", bookDAO.showAll());
        return "books/all";
    }

    @PostMapping
    public String create(@ModelAttribute("book") Book book){
        bookDAO.create(book);
        return "redirect:/books";
    }

    @GetMapping("/new")
    public String newBook(@ModelAttribute("book") Book book){
        return "books/new";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("book", bookDAO.show(id));
        return "books/edit";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable int id, Model model){
        model.addAttribute(bookDAO.show(id));
        return "books/show";
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable int id){
        bookDAO.update(id);
        return "redirect:/books";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        bookDAO.delete(id);
        return "redirect:/books";
    }
}
