package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Materiel;

public interface MaterielRepository extends JpaRepository<Materiel, Long> {
    
   

}
