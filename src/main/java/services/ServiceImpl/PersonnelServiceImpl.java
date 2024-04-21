package services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.PersonnelDao;
import entities.Personnel;
import services.PersonnelService;

import java.util.List;
import java.util.Optional;

@Service
public class PersonnelServiceImpl implements PersonnelService {

    @Autowired
    private PersonnelDao personnelDAO;

    @Override
    public List<Personnel> getAllPersonnel() {
        return personnelDAO.findAll();
    }

    @Override
    public Personnel getPersonnelById(Long id) {
        Optional<Personnel> personnel = personnelDAO.findById(id);
        return personnel.orElse(null);
    }

    @Override
    public Personnel createPersonnel(Personnel personnel) {
        return personnelDAO.save(personnel);
    }

    @Override
    public Personnel updatePersonnel(Long id, Personnel updatedPersonnel) {
        return personnelDAO.findById(id)
                .map(existingPersonnel -> {
                    updatedPersonnel.setId(existingPersonnel.getId());
                    return personnelDAO.save(updatedPersonnel);
                })
                .orElseGet(() -> {
                    updatedPersonnel.setId(id);
                    return personnelDAO.save(updatedPersonnel);
                });
    }

    @Override
    public void deletePersonnel(Long id) {
        personnelDAO.deleteById(id);
    }
}
