package com.booking.showmanagementservice.dto.v1.message;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowTimeDetail {

    private String showTimeId;
    private String showId;
    private Long startTime;
    private Long duration;
    private Long auditoriumId;
    private Long theaterId;

}
