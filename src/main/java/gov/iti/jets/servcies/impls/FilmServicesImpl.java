package gov.iti.jets.servcies.impls;

import java.sql.Timestamp;
import java.util.ArrayList;

import gov.iti.jets.repositories.impls.*;
import gov.iti.jets.servcies.interfaces.*;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import gov.iti.jets.utils.mappers.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class FilmServicesImpl implements FilmServices {

    @WebMethod
    @Override
    public FilmDto findFilmById(int id) {
        FilmRepoImpl filmRepoImpl = new FilmRepoImpl();
        return FilmMapper.INSTANCE.toDto(filmRepoImpl.findFilmById(id));

    }

    @WebMethod
    @Override
    public ArrayList<FilmDto> findAllFilms() {
        FilmRepoImpl filmRepoImpl = new FilmRepoImpl();
        ArrayList<Film> allFilms = filmRepoImpl.findAllFilms();
        ArrayList<FilmDto> allFilmsDto = new ArrayList<>();
        for (int i = 0; i < allFilms.size(); i++) {

            allFilmsDto.add(FilmMapper.INSTANCE.toDto(allFilms.get(i)));
        }

        return allFilmsDto;

    }

}
