package services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.ConsultationDao;
import entities.Consultation;
import services.ConsultationService;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultationServiceImpl implements ConsultationService {

    @Autowired
    private ConsultationDao consultationDAO;

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationDAO.findAll();
    }

    @Override
    public Consultation getConsultationById(Long id) {
        Optional<Consultation> consultation = consultationDAO.findById(id);
        return consultation.orElse(null);
    }

    @Override
    public Consultation createConsultation(Consultation consultation) {
        return consultationDAO.save(consultation);
    }

    @Override
    public Consultation updateConsultation(Long id, Consultation updatedConsultation) {
        return consultationDAO.findById(id)
                .map(existingConsultation -> {
                    updatedConsultation.setId(existingConsultation.getId());
                    return consultationDAO.save(updatedConsultation);
                })
                .orElseGet(() -> {
                    updatedConsultation.setId(id);
                    return consultationDAO.save(updatedConsultation);
                });
    }

    @Override
    public void deleteConsultation(Long id) {
        consultationDAO.deleteById(id);
    }
}
