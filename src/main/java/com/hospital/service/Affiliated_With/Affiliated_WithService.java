package com.hospital.service.Affiliated_With;

import com.hospital.model.Affiliated_With;
import java.util.List;

public interface Affiliated_WithService {
    List<Affiliated_With> getAffiliated_With();
    Affiliated_With getById(int id);
    void save(Affiliated_With affiliated_with);
    void delete(int id);
}
