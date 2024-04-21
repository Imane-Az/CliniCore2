package services;

import java.util.List;

import entities.Personnel;

public interface PersonnelService {
    List<Personnel> getAllPersonnel();
    Personnel getPersonnelById(Long id);
    Personnel createPersonnel(Personnel personnel);
    Personnel updatePersonnel(Long id, Personnel updatedPersonnel);
    void deletePersonnel(Long id);
}
