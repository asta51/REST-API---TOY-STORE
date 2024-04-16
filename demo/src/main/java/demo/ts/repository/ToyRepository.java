package demo.ts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.ts.model.*;
@Repository
public interface ToyRepository extends JpaRepository<User, Integer> {    
}