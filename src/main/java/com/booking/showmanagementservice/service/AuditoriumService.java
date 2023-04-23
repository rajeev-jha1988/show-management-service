package com.booking.showmanagementservice.service;


import com.booking.showmanagementservice.entity.Auditorium;

public interface AuditoriumService {
        Auditorium save(Auditorium auditorium);

        Auditorium findByAuditoriumId(Long id);
}
