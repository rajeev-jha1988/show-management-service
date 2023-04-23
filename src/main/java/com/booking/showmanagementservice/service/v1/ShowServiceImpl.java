package com.booking.showmanagementservice.service.v1;

import com.booking.showmanagementservice.dto.v1.ShowDto;
import com.booking.showmanagementservice.entity.Auditorium;
import com.booking.showmanagementservice.entity.Show;
import com.booking.showmanagementservice.exceptions.InvalidDataException;
import com.booking.showmanagementservice.mapper.ShowMapper;
import com.booking.showmanagementservice.repository.v1.ShowRepository;
import com.booking.showmanagementservice.service.AuditoriumService;
import com.booking.showmanagementservice.service.ShowService;
import org.springframework.stereotype.Service;

@Service
public class ShowServiceImpl implements ShowService {

    private final ShowRepository showRepository;

    private final AuditoriumService auditoriumService;

    public ShowServiceImpl(ShowRepository showRepository, AuditoriumService auditoriumService) {
        this.showRepository = showRepository;
        this.auditoriumService = auditoriumService;
    }


    @Override
    public ShowDto save(ShowDto show) {

        Auditorium byAuditoriumId = auditoriumService.findByAuditoriumId( show.getAuditoriumId() );

        if(byAuditoriumId==null){
            throw new InvalidDataException();
        }
        Show newShow = ShowMapper.INSTANCE.toSeat( show );

        showRepository.save( newShow );

        return ShowMapper.INSTANCE.toSeatDto( newShow  );
    }
}
