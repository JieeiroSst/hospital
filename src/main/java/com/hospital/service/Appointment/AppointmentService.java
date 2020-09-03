package com.hospital.service.Appointment;

import com.hospital.model.Appointment;
import java.util.List;

public interface AppointmentService {
    List<Appointment> getList();
    Appointment getAppointment(int id);
    void save(Appointment appointment);
    void delete(int id);
}
