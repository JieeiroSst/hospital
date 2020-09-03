package com.hospital.service.Stay;

import com.hospital.model.Stay;
import java.util.List;

public interface StayService {
    List<Stay> getList();
    Stay getStay(int id);
    void save(Stay stay);
    void delete(int id);
}
