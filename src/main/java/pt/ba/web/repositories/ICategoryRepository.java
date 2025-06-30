package pt.ba.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.ba.web.entities.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
