package gov.iti.jets.servcies.impls;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.sql.Timestamp;
import java.util.ArrayList;

import gov.iti.jets.repositories.impls.*;
import gov.iti.jets.servcies.interfaces.*;
import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import gov.iti.jets.utils.mappers.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import gov.iti.jets.utils.mappers.*;

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.FilmServices")
public class FilmServicesImpl implements FilmServices {

    @Override
    public FilmDto getFilmById(int id) throws InvalidDataException {
        FilmRepoImpl filmRepoImpl = new FilmRepoImpl();
        if (filmRepoImpl.getFilmById(id) == null) {

            throw new InvalidDataException(" film id not exist");
        }
        return FilmMapper.INSTANCE.toDto(filmRepoImpl.getFilmById(id));

    }

    @Override
    public ArrayList<FilmDto> getAllFilms() {
        FilmRepoImpl filmRepoImpl = new FilmRepoImpl();
        ArrayList<Film> allFilms = filmRepoImpl.getAllFilms();
        ArrayList<FilmDto> allFilmsDto = new ArrayList<>();
        for (int i = 0; i < allFilms.size(); i++) {

            allFilmsDto.add(FilmMapper.INSTANCE.toDto(allFilms.get(i)));
        }

        return allFilmsDto;

    }

    @Override
    public ArrayList<FilmDto> getFilmByLength(Short length) throws InvalidDataException {
        FilmRepoImpl filmRepoImpl = new FilmRepoImpl();
        if (filmRepoImpl.getFilmByLength(length) == null) {

            throw new InvalidDataException(" film length not exist");
        }
        ArrayList<Film> film = filmRepoImpl.getFilmByLength(length);
        ArrayList<FilmDto> filmDto = new ArrayList<>();
        for (int i = 0; i < film.size(); i++) {

            filmDto.add(FilmMapper.INSTANCE.toDto(film.get(i)));
        }

        return filmDto;
    }

    @Override
    public CategoryDto getFilmCategoryById(int id) throws InvalidDataException {

        FilmRepoImpl filmRepoImpl = new FilmRepoImpl();
        if (filmRepoImpl.getFilmCategoryById(id) == null) {

            throw new InvalidDataException(" film id not exist");
        }
        return CategoryMapper.INSTANCE.toDto(filmRepoImpl.getFilmCategoryById(id));
    }

    @Override
    public ArrayList<ActorDto> geFilmActorsById(int id) throws InvalidDataException {
        FilmRepoImpl filmRepoImpl = new FilmRepoImpl();
        ArrayList<ActorDto> actorDto = new ArrayList<>();
        if (filmRepoImpl.geFilmActorsById(id) == null) {

            throw new InvalidDataException(" film id not exist");
        }
        for (int i = 0; i < filmRepoImpl.geFilmActorsById(id).size(); i++) {
            actorDto.add(ActorMapper.INSTANCE.toDto(filmRepoImpl.geFilmActorsById(id).get(i)));
        }
        return actorDto;

    }

}
