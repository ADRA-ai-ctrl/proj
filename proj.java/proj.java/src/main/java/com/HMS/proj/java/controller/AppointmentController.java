package com.HMS.proj.java.controller;

import com.HMS.proj.java.model.Appointment;
import com.HMS.proj.java.repo.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class AppointmentController {
    @RestController
    @RequestMapping("/appointments")
    @CrossOrigin
    public class appointmentcontroller {

        @Autowired
        private AppointmentRepository repo;

        @GetMapping
        public List<Appointment> getAll() {
            return repo.findAll();
        }

        @PostMapping
        public Appointment create(@RequestBody Appointment appointment) {
            return repo.save(appointment);
        }

        @PutMapping("/{id}")
        public Appointment update(@PathVariable Long id, @RequestBody Appointment appointment) {
            appointment.setId(id);
            return repo.save(appointment);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            repo.deleteById(id);


        }
    }
    }
