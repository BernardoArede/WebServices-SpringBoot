package pt.ba.web.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.ba.web.entities.Order;
import pt.ba.web.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/orders")
public class OrderResources {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

   @GetMapping("/{id}")
   public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj =  service.findById(id);
        return ResponseEntity.ok().body(obj);
   }

   @GetMapping("/delete/{id}")
    public ResponseEntity<Order> deleteById(@PathVariable Long id){
        Order obj =  service.findById(id);
        service.deleteById(id);
        return ResponseEntity.ok().body(obj);
   }



}
