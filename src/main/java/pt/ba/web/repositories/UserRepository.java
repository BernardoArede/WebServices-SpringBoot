package pt.ba.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.ba.web.entities.User;

@Repository //Podemos tirar mas vamos deixar para esclarecer
public interface UserRepository extends JpaRepository <User,Long> {

}
