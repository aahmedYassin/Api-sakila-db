package gov.iti.jets.servcies.interfaces;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface FilmServices {

    @WebMethod
    public FilmDto getFilmById(@WebParam(name ="filmId") int id) throws InvalidDataException;

    @WebMethod
    public ArrayList<FilmDto> getAllFilms();

    @WebMethod
    public ArrayList<FilmDto> getFilmByLength(@WebParam(name ="filmLength") Short length) throws InvalidDataException;

    @WebMethod
    public CategoryDto getFilmCategoryById(@WebParam(name ="filmId") int id) throws InvalidDataException;

    @WebMethod
    public ArrayList<ActorDto> geFilmActorsById(@WebParam(name ="filmId") int id) throws InvalidDataException;

}
