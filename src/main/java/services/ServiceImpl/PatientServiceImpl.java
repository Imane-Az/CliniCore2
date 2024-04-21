package services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.PatientDao;
import entities.Patient;
import services.PatientService;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDAO;

    @Override
    public List<Patient> getAllPatients() {
        return patientDAO.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        Optional<Patient> patient = patientDAO.findById(id);
        return patient.orElse(null);
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientDAO.save(patient);
    }

    @Override
    public Patient updatePatient(Long id, Patient updatedPatient) {
        return patientDAO.findById(id)
                .map(existingPatient -> {
                    updatedPatient.setId(existingPatient.getId());
                    return patientDAO.save(updatedPatient);
                })
                .orElseGet(() -> {
                    updatedPatient.setId(id);
                    return patientDAO.save(updatedPatient);
                });
    }

    @Override
    public void deletePatient(Long id) {
        patientDAO.deleteById(id);
    }
}
