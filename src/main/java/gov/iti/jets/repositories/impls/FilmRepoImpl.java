package gov.iti.jets.repositories.impls;

import java.util.ArrayList;

import gov.iti.jets.repositories.interfaces.*;
import gov.iti.jets.model.entities.*;
import gov.iti.jets.utils.EntityManagerSingleton;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.*;
import gov.iti.jets.model.entities.*;

public class FilmRepoImpl implements FilmRepo {

    public FilmRepoImpl() {

    }

    @Override
    public Film getFilmById(int id) {
        return EntityManagerSingleton.getEntityManager().find(Film.class, id);

    }

    @Override
    public ArrayList<Film> getAllFilms() {
        Query query = EntityManagerSingleton.getEntityManager().createQuery("select f from Film f");
        return (ArrayList<Film>) query.getResultList();

    }

    @Override
    public ArrayList<Film> getFilmByLength(Short length) {
        Query query = EntityManagerSingleton.getEntityManager()
                .createQuery("select f from Film f where f.length=:length");
        query.setParameter("length", length);
        return (ArrayList<Film>) query.getResultList();
    }

    @Override
    public Category getFilmCategoryById(int id) {
        Film film = getFilmById(id);
        Set<FilmCategory> filmCategory = film.getFilmCategories();
        List<FilmCategory> filmCategoryList = new ArrayList<>(filmCategory);
        return filmCategoryList.get(0).getCategory();

    }

    @Override
    public ArrayList<Actor> geFilmActorsById(int id) {
        Film film = getFilmById(id);
        Set<FilmActor> filmActors = film.getFilmActors();
        List<FilmActor> filmActorsList = new ArrayList<>(filmActors);
        ArrayList<Actor> actors = new ArrayList<>();
        for (int i = 0; i < filmActorsList.size(); i++) {
            actors.add(filmActorsList.get(i).getActor());
        }

        return actors;
    }

}
