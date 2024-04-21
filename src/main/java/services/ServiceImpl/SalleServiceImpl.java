package services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.SalleDao;
import entities.Salle;
import services.SalleService;

import java.util.List;
import java.util.Optional;

@Service
public class SalleServiceImpl implements SalleService {

    @Autowired
    private SalleDao salleDAO;

    @Override
    public List<Salle> getAllSalles() {
        return salleDAO.findAll();
    }

    @Override
    public Salle getSalleById(Long id) {
        Optional<Salle> salle = salleDAO.findById(id);
        return salle.orElse(null);
    }

    @Override
    public Salle createSalle(Salle salle) {
        return salleDAO.save(salle);
    }

    @Override
    public Salle updateSalle(Long id, Salle updatedSalle) {
        return salleDAO.findById(id)
                .map(existingSalle -> {
                    updatedSalle.setId(existingSalle.getId());
                    return salleDAO.save(updatedSalle);
                })
                .orElseGet(() -> {
                    updatedSalle.setId(id);
                    return salleDAO.save(updatedSalle);
                });
    }

    @Override
    public void deleteSalle(Long id) {
        salleDAO.deleteById(id);
    }
}
