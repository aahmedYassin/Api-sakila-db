package gov.iti.jets.model.entities;
// Generated Apr 3, 2023, 5:27:06 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * FilmText generated by hbm2java
 */
@Entity
@Table(name="film_text"
    ,catalog="sakila"
)
public class FilmText  implements java.io.Serializable {


     private short filmId;
     private String title;
     private String description;

    public FilmText() {
    }

	
    public FilmText(short filmId, String title) {
        this.filmId = filmId;
        this.title = title;
    }
    public FilmText(short filmId, String title, String description) {
       this.filmId = filmId;
       this.title = title;
       this.description = description;
    }
   
     @Id 

    
    @Column(name="film_id", unique=true, nullable=false)
    public short getFilmId() {
        return this.filmId;
    }
    
    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }

    
    @Column(name="title", nullable=false, length=255)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


