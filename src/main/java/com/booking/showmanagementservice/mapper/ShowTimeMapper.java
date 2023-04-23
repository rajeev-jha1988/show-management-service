package com.booking.showmanagementservice.mapper;

import com.booking.showmanagementservice.dto.v1.ShowTimeDto;
import com.booking.showmanagementservice.entity.ShowTime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring" )
public interface ShowTimeMapper {
    ShowTimeMapper INSTANCE = Mappers.getMapper( ShowTimeMapper.class );

    ShowTimeDto toShowTimeDto(ShowTime showTime);
    ShowTime toShowTimeDto(ShowTimeDto showTime);
}
