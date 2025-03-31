package bkvr.spring_data.repository;

import bkvr.spring_data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
