package empire.of.lord.library.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

@SuppressWarnings("unused")
@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String dubbing;
    private LocalDateTime dateTime;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    public Anime(){}

    public Anime(Long id, String title, String dubbing, LocalDateTime dateTime, String description) {
        this.id = id;
        this.title = title;
        this.dubbing = dubbing;
        this.dateTime = dateTime;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDubbing() {
        return dubbing;
    }

    public void setDubbing(String dubbing) {
        this.dubbing = dubbing;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dubbing='" + dubbing + '\'' +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }
}
