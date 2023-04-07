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
    public Film findFilmById(int id) {
        return EntityManagerSingleton.getEntityManager().find(Film.class, id);

    }

    @Override
    public ArrayList<Film> findAllFilms() {
        Query query = EntityManagerSingleton.getEntityManager().createQuery("select f from Film f");
        return (ArrayList<Film>) query.getResultList();

    }

  

}
