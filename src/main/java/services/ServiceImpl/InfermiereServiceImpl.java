package services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.InfermiereDao;
import entities.Infermiere;
import services.InfermiereService;

import java.util.List;
import java.util.Optional;

@Service
public class InfermiereServiceImpl implements InfermiereService {

    @Autowired
    private InfermiereDao infermiereDAO;

    @Override
    public List<Infermiere> getAllInfirmieres() {
        return infermiereDAO.findAll();
    }

    @Override
    public Infermiere getInfirmiereById(Long id) {
        Optional<Infermiere> infermiere = infermiereDAO.findById(id);
        return infermiere.orElse(null);
    }

    @Override
    public Infermiere createInfirmiere(Infermiere infermiere) {
        return infermiereDAO.save(infermiere);
    }

    @Override
    public Infermiere updateInfirmiere(Long id, Infermiere updatedInfermiere) {
        return infermiereDAO.findById(id)
                .map(existingInfermiere -> {
                    updatedInfermiere.setId(existingInfermiere.getId());
                    return infermiereDAO.save(updatedInfermiere);
                })
                .orElseGet(() -> {
                    updatedInfermiere.setId(id);
                    return infermiereDAO.save(updatedInfermiere);
                });
    }

    @Override
    public void deleteInfirmiere(Long id) {
        infermiereDAO.deleteById(id);
    }
}
