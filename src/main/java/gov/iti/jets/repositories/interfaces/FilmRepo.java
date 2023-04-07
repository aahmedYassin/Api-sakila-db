package gov.iti.jets.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.model.entities.*;

public interface FilmRepo {

    public Film findFilmById(int id);
    public ArrayList<Film> findAllFilms();
   

}
