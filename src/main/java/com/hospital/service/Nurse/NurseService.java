package com.hospital.service.Nurse;

import com.hospital.model.Nurse;
import java.util.List;

public interface NurseService {
    List<Nurse> getList();
    Nurse getNurse(int id);
    void save(Nurse nurse);
    void delete(int id);
}
