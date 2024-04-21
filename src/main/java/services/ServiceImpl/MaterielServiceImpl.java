package services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.MaterielDao;
import entities.Materiel;
import services.MaterielService;

import java.util.List;
import java.util.Optional;

@Service
public class MaterielServiceImpl implements MaterielService {

    @Autowired
    private MaterielDao materielDAO;

    @Override
    public List<Materiel> getAllMateriels() {
        return materielDAO.findAll();
    }

    @Override
    public Materiel getMaterielById(Long id) {
        Optional<Materiel> materiel = materielDAO.findById(id);
        return materiel.orElse(null);
    }

    @Override
    public Materiel createMateriel(Materiel materiel) {
        return materielDAO.save(materiel);
    }

    @Override
    public Materiel updateMateriel(Long id, Materiel updatedMateriel) {
        return materielDAO.findById(id)
                .map(existingMateriel -> {
                    updatedMateriel.setId(existingMateriel.getId());
                    return materielDAO.save(updatedMateriel);
                })
                .orElseGet(() -> {
                    updatedMateriel.setId(id);
                    return materielDAO.save(updatedMateriel);
                });
    }

    @Override
    public void deleteMateriel(Long id) {
        materielDAO.deleteById(id);
    }

   
}
