package com.HMS.proj.java.repo;

import com.HMS.proj.java.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

    void deleteById(Long id);
}
