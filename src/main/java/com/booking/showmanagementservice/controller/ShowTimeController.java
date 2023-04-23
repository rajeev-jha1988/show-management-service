package com.booking.showmanagementservice.controller;

import com.booking.showmanagementservice.dto.v1.ShowTimeDto;
import com.booking.showmanagementservice.service.ShowTimeService;
import io.swagger.annotations.Api;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/api")
@Api
public class ShowTimeController {


    private final ShowTimeService showTimeService;

    public ShowTimeController(ShowTimeService showTimeService) {
        this.showTimeService = showTimeService;
    }


    @PostMapping( path = "/show/{id}/showTime" )
    public ResponseEntity<ShowTimeDto> addShowTime( @PathVariable(name = "id") String id,
        @RequestBody @Valid ShowTimeDto showTimeDto) {
        showTimeDto.setShowId( id );
        return ResponseEntity.ok( showTimeService.save( showTimeDto ) );
    }
}
