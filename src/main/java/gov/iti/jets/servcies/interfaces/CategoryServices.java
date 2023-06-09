package gov.iti.jets.servcies.interfaces;

import gov.iti.jets.Exceptions.InvalidDataException;
import java.util.ArrayList;

import gov.iti.jets.model.dtos.*;
import gov.iti.jets.model.entities.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CategoryServices {

    @WebMethod
    public CategoryDto getCategoryById(@WebParam(name = "categoryId") int id) throws InvalidDataException;

    @WebMethod
    public ArrayList<CategoryDto> getAllCategories();

    @WebMethod
    public ArrayList<FilmDto> getCategoryFilmsById(@WebParam(name = "categoryId") int id) throws InvalidDataException;

    @WebMethod
    public CategoryDto updateCategoryById(@WebParam(name = "categoryId") int id, @WebParam(name = "categoryName") String name) throws InvalidDataException;

    @WebMethod

    public int deleteCategoryById(@WebParam(name = "categoryId") int id);

    @WebMethod
    public CategoryDto createCategory(@WebParam(name = "category") CategoryDto categoryDto);
}
