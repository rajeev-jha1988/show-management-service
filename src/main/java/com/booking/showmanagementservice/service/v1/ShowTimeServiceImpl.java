package com.booking.showmanagementservice.service.v1;

import com.booking.showmanagementservice.dto.v1.ShowTimeDto;
import com.booking.showmanagementservice.entity.ShowTime;
import com.booking.showmanagementservice.enums.EventType;
import com.booking.showmanagementservice.mapper.ShowTimeMapper;
import com.booking.showmanagementservice.repository.v1.ShowTimeRepository;
import com.booking.showmanagementservice.service.ShowTimeService;
import com.booking.showmanagementservice.utils.MessagePublisher;
import org.springframework.stereotype.Service;

@Service
public class ShowTimeServiceImpl implements ShowTimeService {

    private final ShowTimeRepository showTimeRepository;

    private final MessagePublisher  messagePublisher;

    public ShowTimeServiceImpl(ShowTimeRepository showTimeRepository, MessagePublisher messagePublisher) {
        this.showTimeRepository = showTimeRepository;
        this.messagePublisher = messagePublisher;
    }

    @Override
    public ShowTimeDto save(ShowTimeDto showTimeDto) {

        ShowTime showTime = ShowTimeMapper.INSTANCE.toShowTimeDto( showTimeDto );
        showTimeRepository.save( showTime );

        messagePublisher.sendMessage( EventType.SHOW_TIME_CREATED,showTime );

        return ShowTimeMapper.INSTANCE.toShowTimeDto(showTime);
    }
}
