package com.booking.showmanagementservice.dto.v1;

import com.booking.showmanagementservice.enums.ShowTimeStatus;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowTimeDto {
    private LocalTime startTime;
    private LocalDate date;
    private int duration;
    private String showId;
    private ShowTimeStatus showTimeStatus;
}
