package com.hospital.service.Undergoes;

import com.hospital.model.Undergoes;
import java.util.List;

public interface UndergoesService {
    List<Undergoes> getList();
    Undergoes getUndergose(int id);
    void save(Undergoes undergoes);
    void delete(int id);
}
