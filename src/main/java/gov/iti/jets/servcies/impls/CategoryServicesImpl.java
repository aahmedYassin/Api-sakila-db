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

@WebService(endpointInterface = "gov.iti.jets.servcies.interfaces.CategoryServices")
public class CategoryServicesImpl implements CategoryServices {

    @Override
    public CategoryDto getCategoryById(int id) throws InvalidDataException {
        CategoryRepoImpl categoryRepoImpl = new CategoryRepoImpl();

        if (categoryRepoImpl.getCategoryById(id) == null) {

            throw new InvalidDataException(" category id not exist");
        }
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

    @Override
    public ArrayList<FilmDto> getCategoryFilmsById(int id) throws InvalidDataException {
        CategoryRepoImpl categoryRepoImpl = new CategoryRepoImpl();
        if (categoryRepoImpl.getCategoryFilmsById(id) == null) {

            throw new InvalidDataException(" category id not exist");
        }
        ArrayList<Film> films = categoryRepoImpl.getCategoryFilmsById(id);
        ArrayList<FilmDto> filmsDto = new ArrayList<>();
        for (int i = 0; i < films.size(); i++) {

            filmsDto.add(FilmMapper.INSTANCE.toDto(films.get(i)));
        }

        return filmsDto;

    }

    @Override
    public CategoryDto updateCategoryById(int id, String name) throws InvalidDataException {
        CategoryRepoImpl categoryRepoImpl = new CategoryRepoImpl();
        if (categoryRepoImpl.updateCategoryById(id, name) == null) {

            throw new InvalidDataException(" category id not exist");
        }
        return CategoryMapper.INSTANCE.toDto(categoryRepoImpl.updateCategoryById(id, name));
    }

    @Override
    public int deleteCategoryById(int id) {
        CategoryRepoImpl categoryRepoImpl = new CategoryRepoImpl();

        return categoryRepoImpl.deleteCategoryById(id);
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        CategoryRepoImpl categoryRepoImpl = new CategoryRepoImpl();
        categoryDto.setLastUpdate(new Timestamp(System.currentTimeMillis()));
        categoryRepoImpl.createCategory(CategoryMapper.INSTANCE.toEntity(categoryDto));
        return categoryDto;
    }

}
