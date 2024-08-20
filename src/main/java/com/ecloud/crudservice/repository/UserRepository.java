package com.ecloud.crudservice.repository;
import com.ecloud.crudservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
