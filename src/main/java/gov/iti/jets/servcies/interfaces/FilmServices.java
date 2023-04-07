package gov.iti.jets.servcies.interfaces;


import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;

public interface FilmServices {
    
     public FilmDto findFilmById(int id);
     public ArrayList<FilmDto> findAllFilms();
  

}
