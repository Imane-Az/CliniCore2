package services;

import java.util.List;

import entities.Consultation;

public interface ConsultationService {
    List<Consultation> getAllConsultations();
    Consultation getConsultationById(Long id);
    Consultation createConsultation(Consultation consultation);
    Consultation updateConsultation(Long id, Consultation updatedConsultation);
    void deleteConsultation(Long id);
}
