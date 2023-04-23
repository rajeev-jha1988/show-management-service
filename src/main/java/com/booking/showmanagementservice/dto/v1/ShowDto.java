package com.booking.showmanagementservice.dto.v1;

import java.time.Instant;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowDto {

    @NotEmpty
    private String title;

    @NotEmpty
    private String genre;

    @NotNull
    private Instant releaseDate;

    @NotEmpty
    private String language;

    @NotNull
    private Integer duration;

    @NotNull
    private Long auditoriumId;

}
