package services.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.MedecinDao;
import entities.Medecin;
import services.MedecinService;

@Service
public class MedecinServiceImpl implements MedecinService {

    @Autowired
    private MedecinDao medecinDAO;

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinDAO.findAll();
    }

    @Override
    public Medecin getMedecinById(Long id) {
        Optional<Medecin> medecin = medecinDAO.findById(id);
        return medecin.orElse(null);
    }

    @Override
    public Medecin createMedecin(Medecin medecin) {
        return MedecinDao.save(medecin);
    }

    @Override
    public Medecin updateMedecin(Long id, Medecin updatedMedecin) {
        if (medecinDAO.existsById(id)) {
            updatedMedecin.setId(id);
            return MedecinDao.save(updatedMedecin);
        }
        return null;
    }

    @Override
    public void deleteMedecin(Long id) {
        MedecinDao.deleteById(id);
    }
}
