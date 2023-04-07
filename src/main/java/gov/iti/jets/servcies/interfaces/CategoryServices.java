package gov.iti.jets.servcies.interfaces;


import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;

public interface CategoryServices {
    
     public CategoryDto findCategoryById(int id);
     public ArrayList<CategoryDto> findAllCategories();
  

}
