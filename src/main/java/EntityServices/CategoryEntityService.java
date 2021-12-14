package EntityServices;

import DAOs.CategoryDao;
import Entities.Category;

import java.util.List;

public class CategoryEntityService {

    private CategoryDao categoryDao;

    public CategoryEntityService(){
        categoryDao = new CategoryDao();
    }

    public List<Category> findAll(){
        return categoryDao.findAll();
    }

    public Category findById(Long id) {
        return categoryDao.findById(id);
    }
}
