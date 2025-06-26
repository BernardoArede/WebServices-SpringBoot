package pt.ba.web.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.ba.web.entities.User;
import pt.ba.web.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/users")
public class UserResources {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

   @GetMapping("/{id}")
   public ResponseEntity<User> findById(@PathVariable Long id){
        User obj =  service.findById(id);
       return ResponseEntity.ok().body(obj); 
   }

}
