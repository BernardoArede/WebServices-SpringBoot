package pt.ba.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.ba.web.entities.Order;
import pt.ba.web.repositories.IOrderRepository;

@Service
public class OrderService {
    @Autowired
    private IOrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
   }

   public void deleteById(Long id){
        orderRepository.deleteById(id);
   }

}
