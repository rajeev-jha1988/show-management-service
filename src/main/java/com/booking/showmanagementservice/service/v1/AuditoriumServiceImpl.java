package com.booking.showmanagementservice.service.v1;

import com.booking.showmanagementservice.entity.Auditorium;
import com.booking.showmanagementservice.repository.v1.AuditoriumRepository;
import com.booking.showmanagementservice.service.AuditoriumService;
import org.springframework.stereotype.Service;

@Service
public class AuditoriumServiceImpl implements AuditoriumService {

    private final AuditoriumRepository auditoriumRepository;

    public AuditoriumServiceImpl(AuditoriumRepository auditoriumRepository) {
        this.auditoriumRepository = auditoriumRepository;
    }

    @Override
    public Auditorium save(Auditorium auditorium) {
        return auditoriumRepository.save( auditorium );
    }

    @Override
    public Auditorium findByAuditoriumId(Long id) {
        return auditoriumRepository.findByAuditoriumId( id );
    }
}
