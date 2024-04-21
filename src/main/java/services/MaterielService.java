package services;

import java.util.List;

import entities.Materiel;

public interface MaterielService {
    List<Materiel> getAllMateriels();
    Materiel getMaterielById(Long id);
    Materiel createMateriel(Materiel materiel);
    Materiel updateMateriel(Long id, Materiel updatedMateriel);
    void deleteMateriel(Long id);
}
