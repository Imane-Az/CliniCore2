package services;

import java.util.List;

import entities.Patient;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient createPatient(Patient patient);
    Patient updatePatient(Long id, Patient updatedPatient);
    void deletePatient(Long id);
}
