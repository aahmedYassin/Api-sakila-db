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


@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.CategoryServices")
public class CategoryServicesImpl implements CategoryServices {

    @Override
    public CategoryDto getCategoryById(int id) {
        CategoryRepoImpl categoryRepoImpl = new CategoryRepoImpl();
        return CategoryMapper.INSTANCE.toDto(categoryRepoImpl.getCategoryById(id));

    }

    @Override
    public ArrayList<CategoryDto> getAllCategories() {
        CategoryRepoImpl categoryRepoImpl = new CategoryRepoImpl();
        ArrayList<Category> allCategories = categoryRepoImpl.getAllCategories();
        ArrayList<CategoryDto> allCategoriesDto = new ArrayList<>();
        for (int i = 0; i < allCategories.size(); i++) {

            allCategoriesDto.add(CategoryMapper.INSTANCE.toDto(allCategories.get(i)));
        }

        return allCategoriesDto;

    }

}
