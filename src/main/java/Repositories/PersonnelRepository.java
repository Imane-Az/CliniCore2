package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Personnel;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
   
}
