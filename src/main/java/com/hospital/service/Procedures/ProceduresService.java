package com.hospital.service.Procedures;

import com.hospital.model.Procedures;
import java.util.List;

public interface ProceduresService {
    List<Procedures> getlist();
    Procedures getProcedures(int id);
    void save(Procedures procedures);
    void delete(int id);
}
