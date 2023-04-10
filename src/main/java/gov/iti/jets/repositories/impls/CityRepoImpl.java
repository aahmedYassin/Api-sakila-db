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

public class CityRepoImpl implements CityRepo {

    public CityRepoImpl() {

    }

    @Override
    public City getCityById(int id) {
        try {
            return EntityManagerSingleton.getEntityManager().find(City.class, id);
        } catch (NoSuchElementException e) {

            return null;
        }
    }


}
