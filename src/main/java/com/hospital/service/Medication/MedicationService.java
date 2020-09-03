package com.hospital.service.Medication;

import com.hospital.model.Medication;
import java.util.List;

public interface MedicationService {
    List<Medication> getList();
    Medication getMedication(int id);
    void save(Medication medication);
    void delete(int id);
}
