package com.booking.showmanagementservice.mapper;

import com.booking.showmanagementservice.dto.v1.ShowDto;
import com.booking.showmanagementservice.entity.Show;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring" )
public interface ShowMapper {
    ShowMapper INSTANCE = Mappers.getMapper( ShowMapper.class );
    Show toSeat(ShowDto seatDto);
    ShowDto toSeatDto(Show show);
    List<ShowDto> toSeatDto(List<Show> seats);
    List<Show> toSeat(List<ShowDto> seats);
}
