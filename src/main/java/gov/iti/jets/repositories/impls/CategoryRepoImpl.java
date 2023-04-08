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

public class CategoryRepoImpl implements CategoryRepo {

    public CategoryRepoImpl() {

    }

    @Override
    public Category getCategoryById(int id) {
        return EntityManagerSingleton.getEntityManager().find(Category.class, id);

    }

    @Override
    public ArrayList<Category> getAllCategories() {
        Query query = EntityManagerSingleton.getEntityManager().createQuery("select c from Category c");
        return (ArrayList<Category>) query.getResultList();

    }

  

}
