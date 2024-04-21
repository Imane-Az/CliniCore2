package services;

import java.util.List;

import entities.Medecin;

public interface MedecinService {
    List<Medecin> getAllMedecins();
    Medecin getMedecinById(Long id);
    Medecin createMedecin(Medecin medecin);
    Medecin updateMedecin(Long id, Medecin updatedMedecin);
    void deleteMedecin(Long id);
}
