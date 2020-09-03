package com.hospital.service.On_Call;

import com.hospital.model.On_Call;
import java.util.List;

public interface On_CallService {
    List<On_Call> getList();
    On_Call getOn_Call(int id);
    void save(On_Call on_call);
    void delete(int id);
}
