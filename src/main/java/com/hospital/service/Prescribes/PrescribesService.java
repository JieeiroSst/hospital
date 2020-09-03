package com.hospital.service.Prescribes;

import com.hospital.model.Prescribes;
import java.util.List;

public interface PrescribesService {
    List<Prescribes> getList();
    Prescribes getPrescribes(int id);
    void save(Prescribes prescribes);
    void delete(int id);
}
