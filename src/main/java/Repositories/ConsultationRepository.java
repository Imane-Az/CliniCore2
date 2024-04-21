package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Consultation;
import entities.Salle;

import java.util.Date;
import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    
    List<Consultation> findByDateConsultationAndSalle(Date date, Salle salle);
    

}
