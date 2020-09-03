package com.hospital.service.Trained_In;

import com.hospital.model.Trained_In;
import java.util.List;

public interface Trained_InService {
    List<Trained_In> getList();
    Trained_In getTrained(int id);
    void save(Trained_In trained_in);
    void delete(int id);
}
