package empire.of.lord.library.dao;

import empire.of.lord.library.models.Anime;
import empire.of.lord.library.models.AnimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimeDAO {

    private final AnimeRepo animeRepo;

    @Autowired
    public AnimeDAO(AnimeRepo animeRepo) {
        this.animeRepo = animeRepo;
    }

    public Iterable<Anime> showAll(){
        return animeRepo.findAll();
    }

    public Anime show(Long id){
        return animeRepo.getOne(id);
    }

    public void create(Anime anime){
        animeRepo.save(anime);
    }

    public void update(Anime updatedAnime){
        animeRepo.save(updatedAnime);
    }

    public void delete(Long id){
        animeRepo.deleteById(id);
    }
}
