package services;

import java.util.List;

import entities.Salle;

public interface SalleService {
    List<Salle> getAllSalles();
    Salle getSalleById(Long id);
    Salle createSalle(Salle salle);
    Salle updateSalle(Long id, Salle updatedSalle);
    void deleteSalle(Long id);
}
