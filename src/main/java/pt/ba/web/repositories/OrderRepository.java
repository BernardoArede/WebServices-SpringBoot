package pt.ba.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.ba.web.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    
}
