package myapiv4.myapiv4.repositories;

import myapiv4.myapiv4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}