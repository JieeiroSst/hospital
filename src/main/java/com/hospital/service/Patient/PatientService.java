package com.hospital.service.Patient;

import com.hospital.model.Patient;
import java.util.List;

public interface PatientService {
    List<Patient> getList();
    Patient getPatient(int id);
    void save(Patient patient);
    void delete(int id);
}
