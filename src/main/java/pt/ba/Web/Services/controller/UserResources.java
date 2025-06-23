package pt.ba.Web.Services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.ba.Web.Services.entities.User;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserResources {


    @GetMapping
    public ResponseEntity<User> findAll() {
        User u1 = new User(
                            1L,
                            "Bernardo", 
                            "bernardo@gmail.com", 
                            "927252511", 
                            "1234");
        return ResponseEntity.ok().body(u1);
    }
    
}
