package empire.of.lord.library.controllers;

import empire.of.lord.library.dao.AnimeDAO;
import empire.of.lord.library.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/anime")
public class AnimeController {
    
    private final AnimeDAO animeDAO;

    @Autowired
    public AnimeController(AnimeDAO animeDAO) {
        this.animeDAO = animeDAO;
    }

    @GetMapping
    public String showAll(Model model){
        model.addAttribute("anime", animeDAO.showAll());
        return "anime/all";
    }

    @PostMapping
    public String create(@ModelAttribute("anime") Anime anime){
        animeDAO.create(anime);
        return "redirect:/anime";
    }

    @GetMapping("/new")
    public String newAnime(@ModelAttribute("anime") Anime anime){
        return "anime/new";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("anime", animeDAO.show(id));
        return "anime/edit";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable Long id, Model model){
        model.addAttribute("anime", animeDAO.show(id));
        return "anime/show";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute Anime updatedAnime){
        animeDAO.update(updatedAnime);
        return "redirect:/anime";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        animeDAO.delete(id);
        return "redirect:/anime";
    }
}
