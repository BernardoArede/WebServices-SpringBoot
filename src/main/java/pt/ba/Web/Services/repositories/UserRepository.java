package pt.ba.Web.Services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.ba.Web.Services.entities.User;

public interface UserRepository extends JpaRepository <User,Long> {}
