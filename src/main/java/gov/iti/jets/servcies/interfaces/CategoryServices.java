package gov.iti.jets.servcies.interfaces;


import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CategoryServices {
    
     @WebMethod
     public CategoryDto getCategoryById(@WebParam(name = "categoryId") int id);
     
     @WebMethod
     public ArrayList<CategoryDto> getAllCategories();
  

}
