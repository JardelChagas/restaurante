package org.example.catalog.Service;

import org.example.catalog.model.Category;
import org.example.catalog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Category findById(Long id){
        return categoryRepository.findById(id).get();
    }
    public Category save(Category category){
        return categoryRepository.save(category);
    }
    public void deleteById(Long id){
        categoryRepository.deleteById(id);
    }

}
