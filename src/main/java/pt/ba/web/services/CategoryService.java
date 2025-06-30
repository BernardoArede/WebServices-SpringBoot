package pt.ba.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.ba.web.entities.Category;
import pt.ba.web.repositories.ICategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(long id) {
        Optional<Category> obj =   categoryRepository.findById(id);
        return obj.get();
    }
}
