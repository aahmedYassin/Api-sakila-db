package gov.iti.jets.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.model.entities.*;

public interface CategoryRepo {

    public Category findCategoryById(int id);
    public ArrayList<Category> findAllCategories();
   

}
