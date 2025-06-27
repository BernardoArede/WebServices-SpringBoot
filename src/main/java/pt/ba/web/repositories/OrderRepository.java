package pt.ba.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.ba.web.entities.Order;

@Repository //Também podemos tirar este daqui tal como no UserRepository
public interface OrderRepository extends JpaRepository <Order,Long> {

    
}
